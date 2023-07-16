package com.example.recyclerview_con_cardview_items;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerview_con_cardview_items.Models.User;
import com.squareup.picasso.Picasso;

public class UserDetailsActivity extends AppCompatActivity {

    private ImageView userImage;
    private TextView userName;
    private TextView userFullName;
    private TextView userAge;
    private TextView userGender;
    private TextView userEmail;

    private TextView userPhone;
    private TextView userBirthDate;
    private TextView userBloodGroup;
    private TextView userHeight;
    private TextView userWeight;
    private TextView userEyeColor;
    private TextView userHairColor;
    private TextView userHairType;
    private TextView userDomain;
    private TextView userIpAddress;
    private TextView userAddress;
    private TextView userCity;
    private TextView userPostalCode;
    private TextView userState;
    private TextView userMacAddress;
    private TextView userUniversity;
    private TextView userCardExpire;
    private TextView userCardNumber;
    private TextView userCardType;
    private TextView userCurrency;
    private TextView userIban;
    private TextView userCompanyAddress;
    private TextView userCompanyCity;
    private TextView userCompanyPostalCode;
    private TextView userCompanyState;
    private TextView userCompanyDepartment;
    private TextView userCompanyName;
    private TextView userCompanyTitle;
    private TextView userEin;
    private TextView userSsn;
    private TextView userAgent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        userImage = findViewById(R.id.userImage);
        userName = findViewById(R.id.userName);
        userFullName = findViewById(R.id.userFullName);
        userAge = findViewById(R.id.userAge);
        userGender = findViewById(R.id.userGender);
        userEmail = findViewById(R.id.userEmail);
        userPhone =findViewById(R.id.userPhone);
        userBirthDate = findViewById(R.id.userBirthDate);
        userBloodGroup = findViewById(R.id.userBloodGroup);
        userHeight = findViewById(R.id.userHeight);
        userWeight = findViewById(R.id.userWeight);
        userEyeColor = findViewById(R.id.userEyeColor);
        userHairColor = findViewById(R.id.userHairColor);
        userHairType = findViewById(R.id.userHairType);
        userDomain = findViewById(R.id.userDomain);
        userIpAddress = findViewById(R.id.userIpAddress);
        userAddress = findViewById(R.id.userAddress);
        userCity = findViewById(R.id.userCity);
        userPostalCode = findViewById(R.id.userPostalCode);
        userState = findViewById(R.id.userState);
        userMacAddress = findViewById(R.id.userMacAddress);
        userUniversity = findViewById(R.id.userUniversity);
        userCardExpire = findViewById(R.id.userCardExpire);
        userCardNumber = findViewById(R.id.userCardNumber);
        userCardType = findViewById(R.id.userCardType);
        userCurrency = findViewById(R.id.userCurrency);
        userIban = findViewById(R.id.userIban);
        userCompanyAddress = findViewById(R.id.userCompanyAddress);
        userCompanyCity = findViewById(R.id.userCompanyCity);
        userCompanyPostalCode = findViewById(R.id.userCompanyPostalCode);
        userCompanyState = findViewById(R.id.userCompanyState);
        userCompanyDepartment = findViewById(R.id.userCompanyDepartment);
        userCompanyName = findViewById(R.id.userCompanyName);
        userCompanyTitle = findViewById(R.id.userCompanyTitle);
        userEin = findViewById(R.id.userEin);
        userSsn = findViewById(R.id.userSsn);
        userAgent = findViewById(R.id.userAgent);

        User user = getIntent().getParcelableExtra("user");

        if (user != null) {
            Picasso.get()
                    .load(user.getImage())
                    .placeholder(R.drawable.placeholder_image)
                    .into(userImage);

            userName.setText(user.getUsername());
            userFullName.setText(user.getFirstName() + " " + user.getLastName());
            userAge.setText(String.valueOf(user.getAge()));

            userGender.setText(user.getGender());
            userEmail.setText(user.getEmail());
            userPhone.setText(user.getPhone());
            userBirthDate.setText(user.getBirthDate());
            userBloodGroup.setText(user.getBloodGroup());
            userHeight.setText(String.valueOf(user.getHeight()));
            userWeight.setText(String.valueOf(user.getWeight()));
            userEyeColor.setText(user.getEyeColor());
            userHairColor.setText(user.getHair().getColor());
            userHairType.setText(user.getHair().getType());
            userDomain.setText(user.getDomain());
            userIpAddress.setText(user.getIp());
            userAddress.setText(user.getAddress().getAddress());
            userCity.setText(user.getAddress().getCity());
            userPostalCode.setText(user.getAddress().getPostalCode());
            userState.setText(user.getAddress().getState());
            userMacAddress.setText(user.getMacAddress());
            userUniversity.setText(user.getUniversity());
            userCardExpire.setText(user.getBank().getCardExpire());
            userCardNumber.setText(user.getBank().getCardNumber());
            userCardType.setText(user.getBank().getCardType());
            userCurrency.setText(user.getBank().getCurrency());
            userIban.setText(user.getBank().getIban());
            userCompanyAddress.setText(user.getCompany().getAddress().getAddress());
            userCompanyCity.setText(user.getCompany().getAddress().getCity());
            userCompanyPostalCode.setText(user.getCompany().getAddress().getPostalCode());
            userCompanyState.setText(user.getCompany().getAddress().getState());
            userCompanyDepartment.setText(user.getCompany().getDepartment());
            userCompanyName.setText(user.getCompany().getName());
            userCompanyTitle.setText(user.getCompany().getTitle());
            userEin.setText(user.getEin());
            userSsn.setText(user.getSsn());
            userAgent.setText(user.getUserAgent());
        }
    }
}

