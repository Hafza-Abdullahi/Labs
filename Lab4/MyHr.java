
public class MyHr {

    private  Offices office1;
    private  Offices office2;
    private  Offices office3;
    private  Offices allOffices[] = new Offices[3];

    //constructors
    public MyHr() {
        office1 = new Offices(); 
        allOffices[0] = office1;
        office2 = new Offices();
        allOffices[0] = office2;
        office3 = new Offices();
        allOffices[0] = office3;

    }

    public void listOffices() {
        for(int i = 0; i < 3; i++) {
            System.out.print(allOffices[i] + " ");
            System.out.println(i);
            
        }
    }



}

