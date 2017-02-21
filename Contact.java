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
  
        public String setName(newName){
                this.name = name;
        }
        public void getName(){
                return newName;
        }
        public long setPhone(newPhone){
                this.phone = phone;
        }
        public void getPhone(){
                return newPhone;
        }
        public String setAddress(newAddress){
                this.address = newAddress;
        }
        public void getAddress(){
                return address;
        }
        public String setComments(newComments){
                this.comments = newComments;
        }
        public void getComments(){
                return comments;
        }

        public String toString(){
                return "(" + name
