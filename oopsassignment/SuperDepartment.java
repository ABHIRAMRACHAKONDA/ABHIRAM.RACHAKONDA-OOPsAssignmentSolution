package oopsassignment;

public class SuperDepartment {
    private static final String DEPARTMENT_NAME = " Super Department ";
    private static final String GET_TODAYS_WORK = " No Work as of now";
    private static final String GET_WORK_DEADLINE = " Nil ";
    private static final String IS_TODAY_A_HOLIDAY = " Today is not a holiday ";

    public String departmentName() {
        return DEPARTMENT_NAME;
    }

    public String getTodaysWork() {
        return GET_TODAYS_WORK;
    }

    public String getWorkDeadline() {
        return GET_WORK_DEADLINE;
    }

    public String isTodayAHoliday() {
        return IS_TODAY_A_HOLIDAY;
    }
}
