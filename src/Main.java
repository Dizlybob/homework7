public class Main {
    public static void main(String[] args) {
         //Task 1
        System.out.println("Task 1");
        int [] paymentsInMonth = {129_599,54_899,80_120,200_050,20_820};
        int totalPaymentInMonth = 0;
        for (int onePayment : paymentsInMonth) {
            totalPaymentInMonth += onePayment;
        }
        System.out.println("Сумма трат за месяц составила " + totalPaymentInMonth + " рублей.");
        //Task 2
        System.out.println("Task 2");
        int [] paymentsInWeek = {5000,50_000,41_500,1890,31_209};
        int maxPayment = paymentsInWeek[0];
        int minPayment = paymentsInWeek[0];
        for (int onePaymentMax : paymentsInWeek) {
            if (maxPayment < onePaymentMax) {
                maxPayment = onePaymentMax;
            }
        }
        for (int onePaymentMin : paymentsInWeek) {
            if (minPayment > onePaymentMin) {
                minPayment = onePaymentMin;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей. Максимальная сумма трат за неделю составила " + maxPayment + " рублей");
        //Task 3
        System.out.println("Task 3");
        int [] wastesForMonth = {61_214,43_800,80_570,120_063,70_901};
        int totalWastesForMonth = 0;
        for (int oneWaste : wastesForMonth) {
            totalWastesForMonth += oneWaste;
        }
        double averageWaste = (double) totalWastesForMonth /wastesForMonth.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageWaste + " рублей");
        //Task 4
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
        }
    }
}