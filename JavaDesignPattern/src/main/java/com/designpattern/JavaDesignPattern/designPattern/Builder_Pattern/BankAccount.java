package com.designpattern.JavaDesignPattern.designPattern.Builder_Pattern;

public class BankAccount {
    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    //Fields omitted for brevity.
    private BankAccount() {
        //Constructor is now private.
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }

    public static class Builder {

        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;

            return this;
        }

        public Builder atBranch(String branch) {
            this.branch = branch;

            return this;
        }

        public Builder openingBalance(double balance) {
            this.balance = balance;

            return this;
        }

        public Builder atRate(double interestRate) {
            this.interestRate = interestRate;

            return this;
        }

        public BankAccount build() {
            //Here we create the actual bank account object, which is always in a fully initialised state when it's returned.
            BankAccount account = new BankAccount();  //Since the builder is in the BankAccount class, we can invoke its private constructor.
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;

            return account;
        }
    }

    /*
        	BankAccount.Builder  builder = new BankAccount.Builder(102);

		BankAccount sampleAccountOne = builder.withOwner("Rock").atBranch("Ballston").build();
		BankAccount sampleAccountTwo = builder.withOwner("Sara").atBranch("Ballston").build();

		System.out.println(sampleAccountOne.toString());
		System.out.println(sampleAccountTwo.toString());

		BankAccount account = new BankAccount.Builder(1234L)
				.withOwner("Marge")
				.atBranch("Springfield")
				.openingBalance(100)
				.atRate(2.5)
				.build();

		BankAccount anotherAccount = new BankAccount.Builder(4567L)
				.withOwner("Homer")
				.atBranch("Springfield")
				.openingBalance(100)
				.atRate(2.5)
				.build();

		System.out.println(account.toString());
		System.out.println(anotherAccount.toString());

		BAccount traditional = new BAccount();
		traditional.setAccountNumber(23);

		System.out.println(traditional.toString());

		//The builder isn't really useful unless only one or two fields among many are mutable.

		//Immutable classes, which is not the case here.
		//When you need to build many of the same things with minor differences. Which is also not the case here.
     */

}
