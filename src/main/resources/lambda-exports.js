require("alexa-scalajs-lambda-test.js");

function makeLambda(scalaCallObject) {
    return function(event, context) {
        try {
            var msg = scalaCallObject.apply(event, context);
            context.done(null, msg);
        } catch (err) {
            context.done(err.toString(), null);
        }
    };
}

exports.handler = makeLambda(com.gu.alexa.AlexaSuccess());
exports.failing = makeLambda(com.gu.alexa.AlexaFail());