package project2;

import java.time.LocalDate;

public class DateRange {
    private LocalDate startDate;
    private LocalDate endDate;

    public DateRange(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public boolean isDateInRange(LocalDate date) {
        if (date.equals(this.startDate) ||
                date.equals(this.endDate) ||
                date.isAfter(startDate) && date.isBefore(endDate)) {
            return true;
        }

        return false;
    }

    boolean overlap(DateRange otherRange) {
        boolean overlapExists = false;

        if( this.isDateInRange(otherRange.startDate)  ||
                this.isDateInRange(otherRange.endDate)) {
            overlapExists = true;
        }

        if( otherRange.isDateInRange(this.startDate)  ||
                otherRange.isDateInRange(this.endDate)) {
            overlapExists = true;
        }



        return overlapExists;
    }



}
