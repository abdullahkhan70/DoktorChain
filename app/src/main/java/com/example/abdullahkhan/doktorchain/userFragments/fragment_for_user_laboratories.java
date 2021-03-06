package com.example.abdullahkhan.doktorchain.userFragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.abdullahkhan.doktorchain.R;
import com.example.abdullahkhan.doktorchain.modelClass.LabModelJson;
import com.example.abdullahkhan.doktorchain.retrofit_Api_interfaces.RetrofitClient;
import com.example.abdullahkhan.doktorchain.userSearchRecyclerView.search_laboratory_from_user_profile_recycler_view;
import com.example.abdullahkhan.doktorchain.userSearchGetterAndSetterRecyclerView.search_laboratory_getter_and_setter;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class fragment_for_user_laboratories extends Fragment {

    List<LabModelJson> list_of_lab_profile = new ArrayList<>();
    search_laboratory_from_user_profile_recycler_view mAdapter;
    RecyclerView recyclerView;
    Context c;
    // search_doctor_for_user_getter_setter hyper_doctors;
    Toolbar toolbar;
    EditText searchView_laboratory_name;

    Spinner spinner;
    CardView cardView;
    ArrayList<String> items = new ArrayList<>();
    private String[] cities = {"Select City","Abbottabad","Adezai","Ali Bandar","Amir Chah","Attock","Ayubia","Bahawalpur","Baden","Bagh","Bahawalnagar","Burewala","Banda Daud Shah",
            "Bannu district|Bannu","Batagram","Bazdar","Bela","Bellpat","Bhag","Bhakkar","Bhalwal","Bhimber","Birote","Buner","Burj","Chiniot","Chachro",
            "Chagai","Chah Sandan","Chailianwala","Chakdara","Chakku","Chakwal","Chaman","Charsadda","Chhatr","Chichawatni","Chitral","Dadu","Dera Ghazi Khan",
            "Dera Ismail Khan","Dalbandin","Dargai","Darya Khan","Daska","Dera Bugti","Dhana Sar","Digri","Dina City|Dina","Dinga",", Pakistan|Diplo","Diwana",
            "Dokri","Drosh","Duki","Dushi","Duzab","Faisalabad","Fateh Jang","Ghotki","Gwadar","Gujranwala","Gujrat","Gadra","Gajar","Gandava","Garhi Khairo",
            "Garruck","Ghakhar Mandi","Ghanian","Ghauspur","Ghazluna","Girdan","Gulistan","Gwash","Hyderabad","Hala","Haripur","Hab Chauki","Hafizabad",
            "Hameedabad","Hangu","Harnai","Hasilpur","Haveli Lakha","Hinglaj","Hoshab","Islamabad","Islamkot","Ispikan","Jacobabad","Jamshoro","Jhang",
            "Jhelum","Jamesabad","Jampur","Janghar","Jati(Mughalbhin)","Jauharabad","Jhal","Jhal Jhao","Jhatpat","Jhudo","Jiwani","Jungshahi","Karachi",
            "Kotri","Kalam","Kalandi","Kalat","Kamalia","Kamararod","Kamber","Kamokey","Kanak","Kandi","Kandiaro","Kanpur","Kapip","Kappar","Karak City",
            "Karodi","Kashmor","Kasur","Katuri","Keti Bandar","Khairpur","Khanaspur","Khanewal","Kharan","kharian","Khokhropur","Khora","Khushab","Khuzdar",
            "Kikki","Klupro","Kohan","Kohat","Kohistan","Kohlu","Korak","Korangi","Kot Sarae","Kotli","Lahore","Larkana","Lahri","Lakki Marwat","Lasbela","Latamber",
            "Layyah","Leiah","Liari","Lodhran","Loralai","Lower Dir","Shadan Lund","Multan","Mandi Bahauddin","Mansehra","Mian Chanu","Mirpur",", Pakistan|Moro","Mardan",
            "Mach","Madyan","Malakand","Mand","Manguchar","Mashki Chah","Maslti","Mastuj","Mastung","Mathi","Matiari","Mehar","Mekhtar","Merui","Mianwali","Mianez",
            "Mirpur Batoro","Mirpur Khas","Mirpur Sakro","Mithi","Mongora","Murgha Kibzai","Muridke","Musa Khel Bazar","Muzaffar Garh","Muzaffarabad","Nawabshah",
            "Nazimabad","Nowshera","Nagar Parkar","Nagha Kalat","Nal","Naokot","Nasirabad","Nauroz Kalat","Naushara","Nur Gamma","Nushki","Nuttal","Okara","Ormara",
            "Peshawar","Panjgur","Pasni City","Paharpur","Palantuk","Pendoo","Piharak","Pirmahal","Pishin","Plandri","Pokran","Pounch","Quetta","Qambar","Qamruddin Karez",
            "Qazi Ahmad","Qila Abdullah","Qila Ladgasht","Qila Safed","Qila Saifullah","Rawalpindi","Rabwah","Rahim Yar Khan","Rajan Pur","Rakhni","Ranipur","Ratodero",
            "Rawalakot","Renala Khurd","Robat Thana","Rodkhan","Rohri","Sialkot","Sadiqabad","Safdar Abad- (Dhaban Singh)","Sahiwal","Saidu Sharif","Saindak","Sakrand",
            "Sanjawi","Sargodha","Saruna","Shabaz Kalat","Shadadkhot","Shahbandar","Shahpur","Shahpur Chakar","Shakargarh","Shangla","Sharam Jogizai","Sheikhupura","Shikarpur","Shingar","Shorap","Sibi","Sohawa","Sonmiani","Sooianwala","Spezand","Spintangi","Sui","Sujawal","Sukkur","Suntsar","Surab","Swabi","Swat",
            "Tando Adam","Tando Bago","Tangi","Tank City","Tar Ahamd Rind","Thalo","Thatta","Toba Tek Singh","Tordher","Tujal","Tump","Turbat","Umarao","Umarkot",
            "Upper Dir","Uthal","Vehari","Veirwaro","Vitakri","Wadh","Wah Cantt","Warah","Washap","Wasjuk","Wazirabad","Yakmach","Zhob","Other"};


    private String[] specialization = {"Specialization","MBBS","BDS","Surgery","Specialist","Heart"};


    private String[] rangeFee = {"Fee Range","300 - 900","1000 - 1499","1500 - 1999","2000 - 4999","5000+"};


    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    public fragment_for_user_laboratories(){}



    @Override
    public View onCreateView(@androidx.annotation.NonNull LayoutInflater inflater , ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        c = parent.getContext();
        //hyper_doctors = new ArrayList<>();
        return inflater.inflate(R.layout.fragment_for_user_laboratories, parent,false);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }



    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(@androidx.annotation.NonNull View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);

//        toolbar = (Toolbar) getView().findViewById(R.id.user_profile_toolbar);
//        AppCompatActivity activity = (AppCompatActivity) getActivity();
//        activity.setSupportActionBar(toolbar);

        searchView_laboratory_name = view.findViewById(R.id.search_laboratory_name);

        searchView_laboratory_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filtered(s.toString());
            }


        });

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(c,android.R.layout.simple_list_item_1,cities);
        SearchableSpinner searchableCities = view.findViewById(R.id.user_laboratory_cities);
        searchableCities.setTitle("Select Cities");
        searchableCities.setPositiveButton("OK");
        searchableCities.setAdapter(citiesAdapter);

        view.isInEditMode();

        cardView = view.findViewById(R.id.cardView3);





        mAdapter = new search_laboratory_from_user_profile_recycler_view(list_of_lab_profile,c);

        recyclerView = view.findViewById(R.id.laboratory_recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(c,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(mLayoutManager);
        //recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);




        setRetrofit(this);

    }

    private void setRetrofit(fragment_for_user_laboratories fragment_for_user_laboratories) {

        RetrofitClient.getInstance().getDataFromDatabase().readLabs().enqueue(new Callback<List<LabModelJson>>() {
            @Override
            public void onResponse(@NonNull Call<List<LabModelJson>> call,@NonNull Response<List<LabModelJson>> response) {
                List<LabModelJson> labModelJson = response.body();
                if(response.isSuccessful()){
                    Log.i("Labs: ", response.message());

                    list_of_lab_profile.addAll(labModelJson);
                    mAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<LabModelJson>> call,@NonNull Throwable t) {

            }
        });
    }

    private void filtered(String toString) {
        ArrayList<LabModelJson> filteredList = new ArrayList<>();

        for(LabModelJson itemsFiltered : list_of_lab_profile){
            if(itemsFiltered.getLabName().toLowerCase().contains(toString.toLowerCase())){
                filteredList.add(itemsFiltered);
            }
        }
        mAdapter.filteredListing(filteredList);

    }

   

}

