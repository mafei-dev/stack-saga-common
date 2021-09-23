# INSTANCE_OWN_HEALTH_REQUEST_TOPIC

when an instance gets started, server publish a event by notifying that one server has been stared. and also that server
store the data for into redis like below.

1. check the server group has and then the group doesn't exist in the hash, the server add new group name newly.
2. after that, server chek that is there any has for the group name, and if there is no one, the server create one and
   add the instance into the hash.