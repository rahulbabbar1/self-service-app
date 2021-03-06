package org.mifos.selfserviceapp.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ModelContainer;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import org.mifos.selfserviceapp.api.local.SelfServiceDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vishwajeet
 * @since 16/8/16.
 */
@Table(database = SelfServiceDatabase.class)
@ModelContainer
public class Charge extends BaseModel {

    @PrimaryKey
    Integer id;

    Integer clientId;
    Integer chargeId;

    @Column
    String name;

    List<Long> dueDate = new ArrayList<>();
    ChargeTimeType chargeTimeType;
    ChargeCalculationType chargeCalculationType;
    Currency currency;

    @Column
    Double amount = 0.0;

    @Column
    Double amountPaid = 0.0;

    @Column
    Double amountWaived = 0.0;

    @Column
    Double amountWrittenOff = 0.0;

    @Column
    Double amountOutstanding = 0.0;

    Boolean penalty = false;

    @Column
    Boolean isActive = false;

    Boolean isPaid = false;
    Boolean isWaived = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChargeId() {
        return chargeId;
    }

    public void setChargeId(int chargeId) {
        this.chargeId = chargeId;
    }

    public int getClientId() {
        return chargeId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getAmountWaived() {
        return amountWaived;
    }

    public void setAmountWaived(double amountWaived) {
        this.amountWaived = amountWaived;
    }

    public double getAmountWrittenOff() {
        return amountWrittenOff;
    }

    public void setAmountWrittenOff(double amountWrittenOff) {
        this.amountWrittenOff = amountWrittenOff;
    }

    public double getAmountOutstanding() {
        return amountOutstanding;
    }

    public void setAmountOutstanding(double amountOutstanding) {
        this.amountOutstanding = amountOutstanding;
    }

    public List<Long> getDueDate() {
        return dueDate;
    }

    public void setDueDate(List<Long> dueDate) {
        this.dueDate = dueDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public ChargeTimeType getChargeTimeType() {
        return chargeTimeType;
    }

    public void setChargeTimeType(ChargeTimeType chargeTimeType) {
        this.chargeTimeType = chargeTimeType;
    }

    public ChargeCalculationType getChargeCalculationType() {
        return chargeCalculationType;
    }

    public void setChargeCalculationType(ChargeCalculationType chargeCalculationType) {
        this.chargeCalculationType = chargeCalculationType;
    }

    public boolean isPenalty() {
        return penalty;
    }

    public void setPenalty(boolean penalty) {
        this.penalty = penalty;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isIsPaid() {
        return isPaid;
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public boolean isIsWaived() {
        return isWaived;
    }

    public void setWaived(boolean isWaived) {
        this.isWaived = isWaived;
    }


}
