package com.allsate.travel.travelbooking.domain;

import java.util.Objects;

public class PlaneTicket extends TravelTicket {
    private String travelClass;
    private int seatNumber;
    private int numberOfLayovers;

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getNumberOfLayovers() {
        return numberOfLayovers;
    }

    public void setNumberOfLayovers(int numberOfLayovers) {
        this.numberOfLayovers = numberOfLayovers;
    }

    @Override
    public String toString() {
        return "PlaneTicket{" +
                "travelClass='" + travelClass + '\'' +
                ", seatNumber=" + seatNumber +
                ", numberOfLayovers=" + numberOfLayovers +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PlaneTicket that = (PlaneTicket) o;
        return seatNumber == that.seatNumber && numberOfLayovers == that.numberOfLayovers && Objects.equals(travelClass, that.travelClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), travelClass, seatNumber, numberOfLayovers);
    }
}
