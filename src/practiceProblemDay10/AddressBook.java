package practiceProblemDay10;

import java.util.Objects;

class AddressBook implements Cloneable {
    private String firstName;
    private String lastName;
    private String address;
    private String cityName;
    private String stateName;
    private Integer phoneNum;
    private Integer zipCode;


    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public  void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }


    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName=cityName;
    }

    public String getStateName(){
        return stateName;
    }

    public void setStateName(String stateName){
        this.stateName=stateName;
    }


    public Integer getPhoneNum(){
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum){
        this.phoneNum=phoneNum;
    }

    public Integer getZipCode(){
        return zipCode;
    }

    public void setZipCode(Integer zipCode){
       this.zipCode=zipCode;
    }

    @Override
    protected AddressBook clone() throws CloneNotSupportedException {
        return (AddressBook) super.clone();
    }

    @Override
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", cityName='" + cityName + '\'' +
                ", stateName='" + stateName + '\'' +
                ", phoneNum=" + phoneNum +
                ", zipCode=" + zipCode +
                '}';
    }

    public boolean equals(AddressBook o) {

        if (o == null || getClass() != o.getClass()) return false;
        AddressBook that = o;
        return firstName.equals(that.firstName) && lastName.equals(that.lastName) && address.equals(that.address) && cityName.equals(that.cityName) && stateName.equals(that.stateName) && phoneNum.equals(that.phoneNum) && zipCode.equals(that.zipCode);
    }


}
