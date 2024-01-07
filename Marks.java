package org.ProjectJavaOOPs;

public abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks{
    private int mathMark;
    private int scienceMark;
    private int chemistryMark;

    public A(int mathMark, int scienceMark, int chemistryMark) {
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.chemistryMark = chemistryMark;
    }

    @Override
    double getPercentage() {
        int tMarks=mathMark+scienceMark+chemistryMark;
        double percentage = tMarks/3.0;
        return percentage;
    }
}
class B extends Marks{
    private int mathMark;
    private int scienceMark;
    private int chemistryMark;
    private int englishMark;

    public B(int mathMark, int scienceMark, int chemistryMark, int englishMark) {
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.chemistryMark = chemistryMark;
        this.englishMark = englishMark;
    }

    @Override
    double getPercentage() {
        int tMarks= mathMark+scienceMark+chemistryMark+englishMark;
        double percentage=  tMarks/4.0;
        return percentage;
    }
}