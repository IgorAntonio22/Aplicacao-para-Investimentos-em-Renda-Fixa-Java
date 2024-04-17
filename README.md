[README EM PT-BR](https://github.com/IgorAntonio22/Aplicacao-para-Investimentos-em-Renda-Fixa-Java/blob/master/README-PTBR.md)

# Fixed Income Investment Application

The objective of this project is to develop an application for fixed income investments. Therefore, we will have a superclass called FixedIncome with the following attributes:

- Name
- CPF
- Bank

In addition, there will be child classes called CDB, LCI, LCA, and Savings. Each of these child classes will have an attribute called interest, with the following values:

- CDB: 120% CDI
- LCI: 100% CDI
- LCA: 105% CDI
- Savings: 0.5% p.m (excluding TR)

The idea is for the user to provide the investment amount in R$, the time in months, and the SELIC rate for the year. Then, the program will inform the result depending on the provided SELIC rate (Suggestion: 13% and 6%). At the end of the calculation, the results will be written to a text file with the name of the investment title.

This program must include:

- Encapsulation
- Abstraction
- Final class
- Interface
- Error handling

Note: Don't forget that the CDB has variable IR according to the investment time.

Remember that the yield of savings is 0.5% p.m when SELIC >= 8.5%. Otherwise, it yields 70% of SELIC.
