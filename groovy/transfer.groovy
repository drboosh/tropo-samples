// --------------------------------------------
// call transfer example
// See http://www.tropo.com for more info
// --------------------------------------------

answer()
print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+callFactory);
say("transfering to ");

def ncall = currentCall.transfer("sip:81345209477@221.122.54.86", 30000);
print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+ncall);
log("Successfully transferred");

