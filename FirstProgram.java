//Multiple Inheritence
interface mother {
    void shivam();

    void ishtihar();

    

}
interface father {

    void gulab();

    void saurabh();

}
class Beta implements mother,father {
    public void saurabh(){
    System.out.println("I'm saurabh");
    }
    public void shivam(){
        System.out.println("I'm Shivam");

    }
    public void gulab(){
        System.out.println("I'm gulab");

    }
    public void ishtihar(){

    }


}

public class FirstProgram {
    public static void main(String[] args) {
        Beta group = new Beta();
        group.saurabh();
        group.shivam();
        group.gulab();
        
    }
}
