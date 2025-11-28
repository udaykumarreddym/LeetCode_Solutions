int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
   int y=arrivalTime+delayedTime;

   if(arrivalTime+delayedTime>=0)
      return y%24;
   else
      return arrivalTime+delayedTime; 
}