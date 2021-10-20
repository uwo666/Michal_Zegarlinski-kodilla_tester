public class User {
    String name;
    int age;
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args){
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        User[] users = {anna, betty, carl, david, eva, frankie};



    }
    public int averageAge(int[] users) {
        int result = 0;
        for (int i = users[age]; i<122; i ++) {
            result = (result + users[age])/users.length;
        }
        return result;
    }
    public int usersUnderAverageAge(int[] users) {
            int average = averageAge(users);
            int result = 0;
            for (int i = age; i<average; i++){
                if (result < average){
                    System.out.println(name);
                }
            }
            return result;
    }


}
