public class Task {
    public static void main(String[] args) {

        double salaryForHour = 5.6;
        int hoursPerDay = 12;
        int days = 364;

        double cashFromWork = salaryForHour * hoursPerDay * (days - 14);
        System.out.println(cashFromWork);

        double vacationMoney = salaryForHour * hoursPerDay * 14 / 2;
        System.out.println(vacationMoney);

        System.out.println(cashFromWork + vacationMoney);
    }
}
