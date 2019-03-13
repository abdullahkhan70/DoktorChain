package com.example.abdullahkhan.doktorchain;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatEditText;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.abdullahkhan.doktorchain.retrofit_Api_interfaces.RetrofitClient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;


public class fragmentForRegisterAsUser extends Fragment {

    Spinner userCity,userBloodGroup;
    AppCompatEditText userName,UserPassword,userAddress,userCNIC,userEmail,userContactNumber;
    Context c;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        c = container.getContext();
        View view = inflater.inflate(R.layout.fragment_fragment_for_register_as_user, container, false);


        String[] cities = {"Select City","Abbottabad","Adezai","Ali Bandar","Amir Chah","Attock","Ayubia","Bahawalpur","Baden","Bagh","Bahawalnagar","Burewala","Banda Daud Shah",
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


        userCity = view.findViewById(R.id.userCity);
       ArrayAdapter<String> arrayForCities = new ArrayAdapter<String>(c,android.R.layout.select_dialog_item,cities);

       userCity.setAdapter(arrayForCities);

        String[] bloodGroup = {"Select Blood Group",
                "A+",
                "A-",
                "B+",
                "B-",
                "AB+",
                "AB-",
                "O+",
                "O-"};
        userBloodGroup = view.findViewById(R.id.userBloodGroup);
        ArrayAdapter<String> arrayForBloodGroup = new ArrayAdapter<String>(c,android.R.layout.select_dialog_item,bloodGroup);

        userBloodGroup.setAdapter(arrayForBloodGroup);

       Button userRegisterButton = view.findViewById(R.id.userRegisterButton);
       userRegisterButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(c,user_profile_navigation_bar.class);
               startActivity(intent);

           }
       });

       userName = view.findViewById(R.id.userName);
       UserPassword = view.findViewById(R.id.userpassword);
       userAddress = view.findViewById(R.id.userAddress);
       userCNIC = view.findViewById(R.id.userCNIC);
       userEmail = view.findViewById(R.id.userEmail);
       userContactNumber = view.findViewById(R.id.userContactNumber);

       validation();

        // Inflate the layout for this fragment
        return view;


    }

    private void validation() {
        String username,userpassword,useraddress,usercnic,useremail,usercontactnumber;

        String userbloodgroup,city;

        username = userName.getText().toString().trim();
        useraddress = userAddress.getText().toString().trim();
        userpassword = UserPassword.getText().toString().trim();
        usercnic = userCNIC.getText().toString().trim();
        useremail = userEmail.getText().toString().trim();
        usercontactnumber = userContactNumber.getText().toString().trim();



        if(username.isEmpty()){
            userName.setError("Enter Your Name!");
            userName.requestFocus();
        }

        if(useremail.isEmpty()) {
            userEmail.setError("Enter Your Email!");
            userEmail.requestFocus();
        }
        if(Patterns.EMAIL_ADDRESS.matcher(useremail).matches()){
            userEmail.setError("Enter Your Valid Email!");
            userEmail.requestFocus();
        }

        if(userpassword.isEmpty()){
            UserPassword.setError("Enter Your Password!");
            UserPassword.requestFocus();
        }

        if(userpassword.length() < 6){
            UserPassword.setError("Enter Your Password Atleast 6");
            UserPassword.requestFocus();
        }

        if(useraddress.isEmpty()){
            userAddress.setError("Enter Your Address!");
            userAddress.requestFocus();
        }

        if(usercnic.isEmpty()){
            userCNIC.setError("Enter Your CNIC!");
            userCNIC.requestFocus();
        }

        if(usercontactnumber.isEmpty()){
            userContactNumber.setError("Enter Your Phone Number!");
            userContactNumber.requestFocus();
        }

        /* Do The Remaining Stuff Here (Retrofit Kind Of Work)!!!*/


//        Call<ResponseBody> fragmentForRegisterAsUser = RetrofitClient.getInstance().getDataFromDatabase().userRegister(
//                useremail,
//                userpassword,
//                "User",
//                username,
//                useraddress,
//                usercontactnumber,
//                usercnic,
//        );


    }


}
