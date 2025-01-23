print("Accessing userObj object in initalize_department.js file : "+JSON.stringify(userObj));
print("Accessing userObj2 object in initalize_department.js file : "+JSON.stringify(userObj2));
print("Accessing userObj3 object in initalize_department.js file : "+JSON.stringify(userObj3));
print("Accessing userObj4 object in initalize_department.js file : "+JSON.stringify(userObj4));
print("Accessing userObj4 object in initalize_department.js file via execution.getVariable : "+JSON.stringify(execution.getVariable("userObj4")));

// when we defined a variable in input parameter section that we can access only within the same task not in another task
//print("Accessing userObj5 object in initalize_department.js file : "+JSON.stringify(userObj5));
var dept={
	id:101,
	name:"IT"
}

print(JSON.stringify(dept));