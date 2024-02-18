public class gettersetter {
    public static void main(String[] args) {
        // Creating an instance of the pen class
        pen p1 = new pen();

        // Setting the color of the pen to "blue"
        p1.setcolor("blue");
        // Printing the color of the pen
        System.out.println(p1.getcolor());

        // Setting the tip size of the pen to 5
        p1.settip(5);
        // Printing the tip size of the pen
        System.out.println(p1.gettip());

        // Changing the color of the pen to "yellow"
        p1.setcolor("yellow");
        // Printing the new color of the pen
        System.out.println(p1.getcolor());

        // Creating an instance of the bankaccount class
        // bankaccount myAcc = new bankaccount();

        // // Setting the username of the bank account to "Anandshukla02"
        // myAcc.username = "Anandshukla02";

        // // Uncommenting the line below would result in a compilation error
        // // as the 'password' field in the bankaccount class is private
        // // myAcc.password="anand123";

        // // Setting the password of the bank account using the public method 'setpass'
        // myAcc.setpass("aanand123");
    }
}


class pen {
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }

    int gettip(){
        return this.tip;
    }

    // Method to set the color of the pen
    void setcolor(String Newcolor) {
        color = Newcolor;
    }

    // Method to set the tip size of the pen
    void settip(int newtip) {
        tip = newtip;
    }
}

