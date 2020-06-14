//In this example we extend the Thread class to create asynchronous programs or multi-threaded applications
class Main{
    public static void main(String[] args) {

        Task t = new Task("Thready 1");
        t.printCrap();
        t.start(); //to start async operations you must invoke the start method of the Thread class. This start() method will look for the run() method in the the class that extends the Thread class
        t.printCrap();

        //Another thread
        Task t2 = new Task("Thready 2");
        t2.printCrap();
        t2.start(); //to start async operations you must invoke the start method of the Thread class. This start() method will look for the run() method in the the class that extends the Thread class
        t2.printCrap();
    }
}

class Task extends Thread{
    private String ThreadName;

    public Task(String ThreadName) { //This constructor is used to change the default name of the thread for demonstration purposes
        super();
        this.ThreadName = ThreadName;
    }

    public Task printCrap(){ //blocking or synchronous method
        System.out.println("Printing...");
        return this;
    }

    public void run() { //predefined async function from the Thread interface. Run is overridden from the Thread class.
        Thread.currentThread().setName(this.ThreadName); //changes the name of the current thread
        try {
            for (int i = 0; i <= 100; i++) {
                System.out.println("number " + i + " - " + Thread.currentThread().getName()); //gets the name of the current thread
                Thread.sleep(1000); //pauses the system for 1 second
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}

