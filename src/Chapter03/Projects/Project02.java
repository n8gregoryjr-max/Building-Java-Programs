package Chapter03.Projects;

public class Project02 {
    public static final double INTEREST = 1.065;  // 6.5% interest

    void main() {
        printTable(1000, 100, 25);
    }


    public static void printTable(int deposit, int yearlyDepo, int years) {
        double balance = 0;
        IO.print("""
                +======+=============+==========+=========+=============+
                | Year | Current Bal | Interest | Deposit | New Balance |
                +======+=============+==========+=========+=============+
                """);

        for (int i = 1; i <= years; i++) {
            year(i);
            current(balance);
            balance = balanceChange(balance);
            interest(balance);
            if (i == 1) {
                balance = deposit;
            } else {
                balance += yearlyDepo;
            }
            deposit(balance);
            current(balance);
            IO.println("|");
        }

        IO.print("+======+=============+==========+=========+=============+");
    }

    public static void year(int year) {
        if (year < 10) {
            IO.print("|  " + year + "   ");
        } else {
            IO.print("|  " + year + "  ");
        }
    }

    public static void current(double bal) {
        String len = String.format("%.2f", bal);
        int space = 12 - len.length();

        IO.print("| " + len);
        for (int i = 0; i < space; i++) {
            IO.print(" ");
        }
    }

    public static void interest(double bal) {
        double newBal = balanceChange(bal);
        double balChange = newBal - bal;

        String interest = String.format("%.2f", balChange);
        int space = 9 - interest.length();

        IO.print("| " + interest);
        for (int i = 0; i < space; i++) {
            IO.print(" ");
        }
    }

    public static void deposit(double dep) {
        if (dep == 1000) {
            IO.print("| 1000.00 ");
        } else {
            IO.print("| 100.00  ");
        }
    }

    // 12 Length

    // Calculate the balance change every year.
    public static double balanceChange(double bal) {

        bal *= INTEREST;
        return bal;
    }
}
/*
A certain bank offers 6.5% interest on savings accounts, compounded annually.
Create a table that shows how much money a person will accumulate over a period of 25 years,
assuming that the person makes an initial investment of $1000 and deposits $100 each year after the first.
Your table should indicate for each year the current balance, the interest, the new deposit, and the new balance.

+======+=============+==========+=========+=============+
| Year | Current Bal | Interest | Deposit | New Balance |
+======+=============+==========+=========+=============+
|  1   | 1000.00     | 65       | 0       | 1065.00     |

and so on...

 */