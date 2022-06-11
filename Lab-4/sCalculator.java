/* Name					        : Md. Maruf Sarker
 * Program			      	: BSC in CSE
 * Section			      	: 221 D4
 * Instructor		      	: Humayun Kabir Rana
 * Date					        : 11-6-22
 * problem name			    : Write a program in java to generate calculator using GUI.
 * problem description	: For solving real life problem, all should know about the graphical user interface. In this Lab experiment the
main focus will be on GUI. Using GUI and java language, all have to implement different types of desktop based
application. So that, they can feel a little touch on industry.
 */

Log:
double t=Math.log10(Double.parseDouble(jTextField1.getText()));
jTextField1.setText("");
jTextField1.setText(jTextField1.getText() + t);
Sin:
double num1=Math.toRadians(Double.parseDouble(jTextField1.getText()));
double num2=Math.sin(num1);
jTextField1.setText("");
jTextField1.setText(jTextField1.getText() + num2);
Cos:
double num1=Math.toRadians(Double.parseDouble(jTextField1.getText()));
double num2=Math.cos(num1);
jTextField1.setText("");
jTextField1.setText(jTextField1.getText() + num2);
Tan:
double num1=Math.toRadians(Double.parseDouble(jTextField1.getText()));
double num2=Math.tan(num1);
jTextField1.setText("");
jTextField1.setText(jTextField1.getText() + num2);
Factorial (x!):
double t=Double.parseDouble(jTextField1.getText());
double fact=1;
while(t!=0){
fact= fact*t;
t−−;
}
jTextField1.setText("");
jTextField1.setText(jTextField1.getText() + fact);
Root[U+FFFD]
(
):
double t = Double.parseDouble(String.valueOf(jTextField1.getText()));
t = Math.sqrt(t);
jTextField1.setText(String.valueOf(t));
Square (x2
):
double t=Double.parseDouble(jTextField1.getText());
t=t*t;
jTextField1.setText("");
jTextField1.setText(jTextField1.getText() + t);