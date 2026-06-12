// package model ;

// import java.security.PublicKey;
// import java.time.LocalDateTime;

// public class Customer {

//     private String fullName;
//     private String passportNumber;
//     private LocalDateTime departureDate;
//     private LocalDateTime arrivalDate;
//     private String destination;
//     private int transitDuration;
//     private boolean status;

//     // ================= GETTERS =================

//     public String getFullName() {
//         return fullName;
//     }

//     public String getPassportNumber() {
//         return passportNumber;
//     }

//     public LocalDateTime getDepartureDate() {
//         return departureDate;
//     }

//     public LocalDateTime getArrivalDate() {
//         return arrivalDate;
//     }

//     public String getDestination() {
//         return destination;
//     }

//     public int getTransitDuration() {
//         return transitDuration;
//     }

//     public boolean getStatus() {
//         return status;
//     }

//     // ================= SETTERS =================

//     public void setFullName(String fullName) {
//         this.fullName = fullName;
//     }

//     public void setPassportNumber(String passportNumber) {
//         this.passportNumber = passportNumber;
//     }

//     public void setDepartureDate(LocalDateTime departureDate) {
//         this.departureDate = departureDate;
//     }

//     public void setArrivalDate(LocalDateTime arrivalDate) {
//         this.arrivalDate = arrivalDate;
//     }

//     public void setDestination(String destination) {
//         this.destination = destination;
//     }

//     public void setTransitDuration(int transitDuration) {
//         this.transitDuration = transitDuration;
//     }

//     public void setStatus(boolean status) {
//         this.status = status;
//     }

//     // ================= METHODS =================

//     public void updateStatus() {
//         this.status = true;
//     }

//     public void updateFlight(LocalDateTime newDepartureDate,
//         LocalDateTime newArrivalDate,
//         int transit) {

//         this.departureDate = newDepartureDate;
//         this.arrivalDate = newArrivalDate;
//         this.transitDuration = transit;
//     }

//     public void updateFlight(LocalDateTime newDepartureDate,
//         LocalDateTime newArrivalDate) {

//         updateFlight(newDepartureDate, newArrivalDate, 0);
//     }

//     public Customer Search(String passportNumber){
//         // Code here After DB 
//         return Customer ;
//     }

//     public Customer Search(String name){
//         // code here after DB 
        
//     }
// }
