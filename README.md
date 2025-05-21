System Overview (Short & Simple):
 Purpose:
Ye ek Noise Monitoring System hai jo automatically detect karta hai agar kisi room mein zyada awaaz ho rahi hai (dangerous noise), aur phir uski notification parent device ko bhejta hai.

 Working Style: Automatic
 No User Input Needed

 Sirf program run karte hi NoiseSensor khud "detectNoise()" call karta hai

 Ye event ek chain reaction start karta hai (Observer Pattern ka use karke)

 Event Flow (Auto Trigger):
NoiseSensor.detectNoise() → Noise detect hoti hai

Ye observer ko notify karta hai (Observer pattern use ho raha hai)

MonitoringSystem react karta hai aur AlertAnalyzer se check karta hai: noise dangerous hai?

Agar dangerous hai (true return), to NotificationService ko alert bhejta hai

NotificationService → ParentDevice ko message bhej deta hai

 Design Patterns Used:
Pattern	Use
 Observer Pattern	MonitoringSystem ko register kiya gaya hai NoiseSensor ke saath observer ke taur par.
 Separation of Concerns (SoC)	Har class sirf apna kaam kar rahi hai:
