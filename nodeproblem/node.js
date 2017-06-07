
var waitUntil = require('wait-until');


function getnumber(){
	var array = [];
	var j=0;
	for (i=1; i<=100; i++) {
	    setTimeout(function(i) {
	    	j++;
	        array[i-1]=i;
	        if(j==20){
	        	return array;
	        }
	    }.bind(this, i), Math.random()*1000);
	}
	return array;
}

array = getnumber();

waitUntil()
    .interval(1000)
    .times(1)
    .condition(function(cb) {
        process.nextTick(function() {
            console.log(array);
        });
    })
    .done(function(result) {
    	// console.log(result);
        // do stuff 
    });

