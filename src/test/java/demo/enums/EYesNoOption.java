package demo.enums;

public enum EYesNoOption {

    YES("Yes"),
    NO("No");

    private String option;

    EYesNoOption(String option)
    {
        this.option = option;
    }

    public static EYesNoOption fromString(String name)
    {
        for (EYesNoOption sortByOption : values()) {
            if (sortByOption.option.equalsIgnoreCase(name)) {
                return sortByOption;
            }
        }
        throw new IllegalArgumentException("No option found with: " + name);
    }
}