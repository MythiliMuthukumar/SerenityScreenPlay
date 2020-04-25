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
        for (EYesNoOption yesNoOption : values()) {
            if (yesNoOption.option.equalsIgnoreCase(name)) {
                return yesNoOption;
            }
        }
        throw new IllegalArgumentException("No option found with: " + name);
    }
}