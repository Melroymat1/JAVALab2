class Candidate {
    String name;
    int appNumber;
    String examCenter;


    void registerCandidate(String name, int appNumber) {
        this.name = name;
        this.appNumber = appNumber;
    }

    
    void registerCandidate(String name, int appNumber, String examCenter) {
        this.name = name;
        this.appNumber = appNumber;
        this.examCenter = examCenter;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Application No: " + appNumber);
        System.out.println("Exam Center: " + (examCenter != null ? examCenter : "Not Assigned"));
    }

    public static void main(String[] args) {
        Candidate c1 = new Candidate();
        c1.registerCandidate("Alice", 1001);

        Candidate c2 = new Candidate();
        c2.registerCandidate("Bob", 1002, "Center A");

        c1.display();
        System.out.println();
        c2.display();
    }
}
