package demo.enums;

public enum ETodayTomorrowOption {

    TODAY("Today"),
    TOMORROW("Tomorrow");

    private String date;

    ETodayTomorrowOption(String date)
    {
        this.date = date;
    }

    public static ETodayTomorrowOption fromString(String name)
    {
        for (ETodayTomorrowOption todayTomorrowOption : values()) {
            if (todayTomorrowOption.date.equalsIgnoreCase(name)) {
                return todayTomorrowOption;
            }
        }
        throw new IllegalArgumentException("No option found with: " + name);
    }

}
