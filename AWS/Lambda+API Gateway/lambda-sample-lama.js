console.log('Loading function');

exports.handler = async (event, context, callback) => {
    
    let num1 = event.n1;
    let num2 = event.n2;
    
    let result = num1 * num2;
    //console.log('Received event:', JSON.stringify(event, null, 2));
    //console.log('value1 =', event.key1);
    //console.log('value2 =', event.key2);
    //console.log('value3 =', event.key3);
    //return event.key1;  // Echo back the first key value
    // throw new Error('Something went wrong');
    callback(null, {statusCode: 200, body: result})
};
