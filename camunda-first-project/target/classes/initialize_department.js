print("userObj is the part of User Initialize Script and trying to access in other script : "+JSON.stringify(userObj));
print("userObj2 is the part of User Initialize Script and trying to access in other script : "+JSON.stringify(userObj2));
print("userObj3 is the part of User Initialize Script and trying to access in other script : "+JSON.stringify(userObj3));
print("userObj4 is the part of User Initialize Script and trying to access in other script : "+JSON.stringify(userObj4));
print("userObj4 is the part of User Initialize Script and trying to access in other script via execution.getVariable: "+JSON.stringify(execution.getVariable("userObj4")));

var deptObj={
	id:2,
	name:"IT"
}

print("Department Object : "+JSON.stringify(deptObj));