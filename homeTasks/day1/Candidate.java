public Class Candidate{
    String name;
    int marks;

    public Candidate(String name, String marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName(){
        return this.name;
    }

    public int getMarks(){
        return this.marks;
    }

    public int compareTo(Candidate candidate){
        return this.marks - candidate.marks;
    }
}

