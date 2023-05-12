public class Account {
        private static int idUp = 1;
        private int id;
        private String username;
        private String password;
        private String fullname;
        private  String phoneNumber;
        private String address;

        public Account() {
        }



    public Account(String username, String password, String fullname,   String phoneNumber, String address) {
        this.id = idUp++;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.address = address;

    }



    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return id +
                    "," + username +
                    "," + password +
                    "," + fullname +
                    "," + phoneNumber+
                    "," + address;
        }
    }
