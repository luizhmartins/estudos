package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.exception.DomainException;

public class Reservation {

	public static final DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException{
		if(checkIn.isAfter(checkOut)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		if(checkIn.isBefore(LocalDate.now())) {
			throw new DomainException("Reservation dates must be future dates");	
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public Duration duration() {
		return Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());
	}
	
	public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
		if(checkIn.isAfter(checkOut)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		if(checkIn.isBefore(LocalDate.now())) {
			throw new DomainException("Reservation dates for update must be future dates");	
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ fmt1.format(checkIn)
			+ ", check-out: "
			+ fmt1.format(checkOut)
			+ ", "
			+ duration().toDaysPart()
			+ " nights";
	}
}