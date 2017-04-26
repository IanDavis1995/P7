package edu.ceg3900.ian;

/** Collect all data about a given Country's grade data.
 */
public class CountryGradeData {
    private String countryCode;
    private Double sumOfGrades;
    private Integer numberOfGrades;

    boolean marked;

    public CountryGradeData(String countryCode) {
        this.countryCode = countryCode;
        this.sumOfGrades = 0.0;
        this.numberOfGrades = 0;
        this.marked = false;
    }

    public void addNewGrade(Double gradeValue) {
        this.sumOfGrades += gradeValue;
        this.numberOfGrades++;
    }

    public Double averageGrade() {
        return this.sumOfGrades / this.numberOfGrades;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
