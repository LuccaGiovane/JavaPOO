package ExerciciosDeSala.Ex13;

import java.math.BigDecimal;
public class Conta
{
        private String name;
        protected BigDecimal balance;

        public Conta(String name, BigDecimal balance)
        {
            this.name = name;
            this.balance = BigDecimal.ZERO;

            if (balance.compareTo(BigDecimal.ZERO) > 0)
            {
                this.balance = balance;
            }
        }

        public void deposit(BigDecimal depositAmount)
        {
            if (depositAmount.compareTo(BigDecimal.ZERO) > 0)
            {
                balance = balance.add(depositAmount);
            }
        }

        public BigDecimal getBalance()
        {
            return balance;
        }


        public void setName(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }
}
