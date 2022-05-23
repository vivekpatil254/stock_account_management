package com.bridgelabz;

import java.util.*;

public class StockAccount {
    String stockName;
    int numberOfShares, sharePrice, totalValue;

    public static void main(String[] args) {
        StockAccount object1=new StockAccount();
       List <StockAccount> object = new ArrayList<StockAccount>();
        int i;
        for (i = 0; i < 5; i++) {
            object1.getData();
            object.add(object1);
        }
        for (i = 0; i < 5; i++) {
            object.get(i).calculate();
            object.get(i).display();
        }

    }

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the stock information");
        System.out.println(" Name              :     ");
        stockName = scanner.next();
        System.out.println(" Number Of Shares  :     ");
        numberOfShares = scanner.nextInt();
        System.out.println(" Share Price       :     ");
        sharePrice = scanner.nextInt();

    }

    public void calculate() {
        totalValue = sharePrice * numberOfShares;

    }

    public void display() {
        System.out.println("Stock name          :   " + stockName);
        System.out.println("Number of shares    :   " + numberOfShares);
        System.out.println(" Share Price        :   " + sharePrice);
        System.out.println(" Total value        :   " + totalValue);
    }
    public void debit()
    {
        int debitAmmount;
        System.out.println("Enterr ammount to be debited from account : ");
        Scanner scanner = new Scanner(System.in);
        debitAmmount = scanner.nextInt();
        if(totalValue<debitAmmount)
        {
            System.out.println("the debit ammount not possible becouse it  is more than avaialable total value");
        }
        else
        { totalValue=totalValue-debitAmmount;
        System.out.println("Total avaialable ammount iin account is : "+totalValue);
        }
    }
}
