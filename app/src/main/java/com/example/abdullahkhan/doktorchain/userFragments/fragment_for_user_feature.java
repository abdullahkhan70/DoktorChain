package com.example.abdullahkhan.doktorchain.userFragments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Script;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.abdullahkhan.doktorchain.AddDoctors.addDoctor;
import com.example.abdullahkhan.doktorchain.R;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;


public class fragment_for_user_feature extends Fragment {

    Context c;
    Activity cc;
    CardView cardView1;
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

    public fragment_for_user_feature(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        c = container.getContext();
        cc = (Activity) container.getContext();
        return inflater.inflate(R.layout.fragment_for_user_features,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        cardView1 = view.findViewById(R.id.feature_hos);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Dialog dialog = new Dialog(c);
//                dialog.setContentView(R.layout.fragment_add_doctor);
//                EditText complete_name = dialog.findViewById(R.id.complete_name);
//                EditText complete_address = dialog.findViewById(R.id.complete_address);
//
//                ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(c,android.R.layout.simple_list_item_1,cities);
//                SearchableSpinner searchableCities = dialog.findViewById(R.id.add_hospital_into_database);
//                searchableCities.setTitle("Select Cities");
//                searchableCities.setPositiveButton("OK");
//                searchableCities.setAdapter(citiesAdapter);
//
//                EditText add_phone_no_hospital = dialog.findViewById(R.id.add_phone_no_hospital);
//                EditText add_email_address = dialog.findViewById(R.id.add_email_address);
//                EditText add_hospital_website_link = dialog.findViewById(R.id.add_hospital_website_link);
//                AppCompatButton upload_hospital_pic = dialog.findViewById(R.id.upload_hospital_pic);
//                TextView file_path = dialog.findViewById(R.id.file_path);
//
//                EditText hospital_description = dialog.findViewById(R.id.hospital_description);
//                EditText add_doctors_hospital = dialog.findViewById(R.id.add_doctors_hospital);
//                AppCompatButton connect_facebook = dialog.findViewById(R.id.connect_facebook);
//                AppCompatButton connect_linkedin = dialog.findViewById(R.id.connect_linkedin);
//                AppCompatButton connect_twitters = dialog.findViewById(R.id.connect_twitters);
//
//                Window window = dialog.getWindow();
//                window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//                dialog.show();

//                AppCompatActivity Activity = (AppCompatActivity) v.getContext();
//                Fragment fragment = new addDoctor();
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                ft.replace(R.id.feature_hos,fragment).commit();

                Fragment nextFrag= new addDoctor();
                AppCompatActivity appCompatActivity = (AppCompatActivity) v.getContext();
                appCompatActivity.getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_switch, nextFrag, nextFrag.getTag())
                        .addToBackStack(null)
                        .commit();


//        CardView p = view.findViewById(R.id.feature_hos);
//        p.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                addDoctor addDoctor = new addDoctor();
//
//                assert getFragmentManager() != null;
//                addDoctor.show(getFragmentManager(),"theCustomDialog");
//            }
//        });
    }
});
    }
}
