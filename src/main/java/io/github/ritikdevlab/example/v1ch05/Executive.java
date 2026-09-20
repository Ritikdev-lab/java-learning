package io.github.ritikdevlab.example.v1ch05;

public final class Executive extends Manager {
    private String title;

    /**
     * The familiar Manager class, with equals, hashCode, and toString method.
     * @param name the name
     * @param title the title
     * @param salary the salary
     * @param year the year
     * @param month the month
     * @param day the day
     */
    public Executive(String name, String title, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        this.title = title;
    }

    /**
     * Get the title of this executive
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get the description of this executive
     * @return the description
     */
    public String description() {
        if (title.length() >= 200) {
            return "An executieve with an impressive titile";
        }
        else {
            return "An executieve with a title of " + title;
        }
    }
}
