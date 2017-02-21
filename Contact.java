public class Contact{
  private String name;
  private long phone;
  private String address;
  private String comments;
  
  public Contact(String name, long phone, String address, String comments){
    this.name = name;
    this.phone = phone;
    this.address = address;
    this.comments = comments;
  }
  
  public String setName(name){
     this.name = name;
  }
  public void getName(){
    return name;
  }
  public long setPhone(phone){
    this.phone = phone;
  }
  public void getPhone(){
    return phone;
  }
  public String setAddress(address){
    this.address = address;
  }
  public void getAddress(){
    return address;
  }
  public String setComments(comments){
    this.comments = comments;
  }
  public void getComments(){
    return comments;
  }
  
  public String toString(){
    return "(" + name
