package sample;

import java.time.LocalDate;

public class ClientRegister {
    private String glassPrescription;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private String address;
    private String cityName;
    private String stateName;
    private String countryName;
    private String phoneNumber;
    private String email;

    public ClientRegister(String glassPrescription1,String firstName1,String lastName1,String gender1,LocalDate dateOfBirth1,
                          String address1,String cityName1,String stateName1,String countryName1,String phoneNumber1, String emailNumber1)
    {
        this.glassPrescription = glassPrescription1;
        this.firstName = firstName1;
        this.lastName = lastName1;
        this.gender = gender1;
        this.dateOfBirth = dateOfBirth1;
        this.address = address1;
        this.cityName = cityName1;
        this.stateName = stateName1;
        this.countryName = countryName1;
        this.phoneNumber = phoneNumber1;
        this.email = emailNumber1;
    }

    public void setGlassPrescription(String glassPrescription2)
    {
        this.glassPrescription = glassPrescription2;
    }

    public String getGlassPrescription()
    {
        return glassPrescription;
    }

    public void setFirstName(String firstName2)
    {
        this.firstName = firstName2;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName2)
    {
        this.lastName = lastName2;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setGender(String gender2)
    {
        this.gender = gender2;
    }

    public String getGender()
    {
        return gender;
    }

    public void setDateOfBirth(LocalDate dateOfBirth2)
    {
        this.dateOfBirth = dateOfBirth2;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setAddress(String address2)
    {
        this.address = address2;
    }

    public String getAddress()
    {
        return address;
    }
    public void setCityName(String cityName2)
    {
        this.cityName = cityName2;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setStateName(String stateName2)
    {
        this.stateName = stateName2;
    }

    public String getStateName()
    {
        return stateName;
    }

    public void setCountryName(String countryName2)
    {
        this.countryName = countryName2;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setPhoneNumber(String phoneNumber2)
    {
        this.phoneNumber = phoneNumber2;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setEmail(String emailNumber2)
    {
        this.email = emailNumber2;
    }

    public String getEmail()
    {
        return email;
    }


}
