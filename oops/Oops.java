public class Oops {
    public static void main(String[] args) {
        // Creating an instance of the pen class
        pen p1 = new pen();
        
        // Setting the color of the pen to "blue"
        p1.setcolor("blue");
        // Printing the color of the pen
        System.out.println(p1.color);

        // Setting the tip size of the pen to 5
        p1.settip(5);
        // Printing the tip size of the pen
        System.out.println(p1.tip);

        // Changing the color of the pen to "yellow"
        p1.color = "yellow";
        // Printing the new color of the pen
        System.out.println(p1.color);

        // Creating an instance of the bankaccount class
        bankaccount myAcc = new bankaccount();

        // Setting the username of the bank account to "Anandshukla02"
        myAcc.username = "Anandshukla02";

        // Uncommenting the line below would result in a compilation error
        // as the 'password' field in the bankaccount class is private
        // myAcc.password="anand123";

        // Setting the password of the bank account using the public method 'setpass'
        myAcc.setpass("aanand123");
    }
}

class bankaccount {
    String username;
    @SuppressWarnings("unused")
    private String password; // 'password' field is private

    // Public method to set the password
    public void setpass(String pwd) {
        password = pwd;
    }
}

class pen {
    String color;
    int tip;

    // Method to set the color of the pen
    void setcolor(String Newcolor) {
        color = Newcolor;
    }

    // Method to set the tip size of the pen
    void settip(int newtip) {
        tip = newtip;
    }
}

class student {
    String name;
    int age;
    float percentage;

    // Method to calculate percentage
    void percentage(int m, int c) {
        percentage = (float) (m + c) / c * 100;
    }
}
