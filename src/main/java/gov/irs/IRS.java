package gov.irs;

import java.util.ArrayList;
import java.util.List;

public class IRS {


    private int currentIndex = 0;
    private List<TaxPayer> taxPayers = new ArrayList<>();

    private IRS() {

    }

    public void register(TaxPayer taxPayer) {
        taxPayers.add(taxPayer);
    }

    public double computeTotalMonthlyTaxToCollect() {

        return 0.0;
    }

}