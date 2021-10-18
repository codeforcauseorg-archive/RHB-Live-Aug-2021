import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.keycloak.TokenVerifier;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.representations.JsonWebToken;
import org.keycloak.representations.idm.UserRepresentation;

import java.util.List;

import static org.keycloak.OAuth2Constants.CLIENT_CREDENTIALS;

public class KCDemo {
    public static void main(String[] args){

        try{
//            String token = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJ6X1lmTDZRUXM5Z1NBUi1BRGE1Z1ZJZG5UamZnX0FKTW1mTk9qcmpTMlVBIn0.eyJleHAiOjE2MzQ1NDEyMDQsImlhdCI6MTYzNDU0MDkwNCwiYXV0aF90aW1lIjoxNjM0NTQwNTAyLCJqdGkiOiJiZmQ5NjA4ZC05OWY3LTQwMmItOTAwMC00MDAzMjg4ODJjMTEiLCJpc3MiOiJodHRwczovL2xlbXVyLTYuY2xvdWQtaWFtLmNvbS9hdXRoL3JlYWxtcy9yaGIiLCJhdWQiOlsicmVhbG0tbWFuYWdlbWVudCIsImFjY291bnQiXSwic3ViIjoiYzA2Y2MzZTktYzQ1My00ZDcxLWI1MDItMjUwNmVlYjVlYjdkIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoibXl3ZWIiLCJub25jZSI6IjRiMWQyYTAzLWFiMzYtNDE2Yi04MmNlLTEyZjc4ZDhhN2IzMiIsInNlc3Npb25fc3RhdGUiOiIzYjMyMzU3Ni1mYzZkLTQ1N2YtODgxYy0yNDQyYTRmYjA5ZTkiLCJhY3IiOiIwIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJkZWZhdWx0LXJvbGVzLXJoYiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7InJlYWxtLW1hbmFnZW1lbnQiOnsicm9sZXMiOlsidmlldy1yZWFsbSIsInZpZXctaWRlbnRpdHktcHJvdmlkZXJzIiwibWFuYWdlLWlkZW50aXR5LXByb3ZpZGVycyIsImltcGVyc29uYXRpb24iLCJyZWFsbS1hZG1pbiIsImNyZWF0ZS1jbGllbnQiLCJtYW5hZ2UtdXNlcnMiLCJxdWVyeS1yZWFsbXMiLCJ2aWV3LWF1dGhvcml6YXRpb24iLCJxdWVyeS1jbGllbnRzIiwicXVlcnktdXNlcnMiLCJtYW5hZ2UtZXZlbnRzIiwibWFuYWdlLXJlYWxtIiwidmlldy1ldmVudHMiLCJ2aWV3LXVzZXJzIiwidmlldy1jbGllbnRzIiwibWFuYWdlLWF1dGhvcml6YXRpb24iLCJtYW5hZ2UtY2xpZW50cyIsInF1ZXJ5LWdyb3VwcyJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQgcHJvZmlsZSBlbWFpbCIsInNpZCI6IjNiMzIzNTc2LWZjNmQtNDU3Zi04ODFjLTI0NDJhNGZiMDllOSIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJuYW1lIjoicmhiIEFkbWluaXN0cmF0b3IiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJhZG1pbiIsImdpdmVuX25hbWUiOiJyaGIiLCJmYW1pbHlfbmFtZSI6IkFkbWluaXN0cmF0b3IiLCJlbWFpbCI6ImFkbWluQGVtYWlsLmNvbSJ9.AV9PypQ1fxFODu6tVVCFEB5U7mnBwWKxMPtubBqfwSxoMF0tvSTsuygA2YeDLB8hpPVf6y7bfR0czNYf5dW8M4kOO4ecOUuCgSgNKgffyE7sRlXBse_BEfOQOvQ-fz2BjaOIxKADPT5hVbcpnbVpQF99w_AvGtzfodmaOX-VEzXsK4OpozdHsW9acpUERCJRICCGTqBvIDEjg2VUlGdXF3g3WhSmABtkCGDByuOVHxYlbb9tOMD5SWl3XNV-61ZIG7Yf9VhS3ZlbLDmaAbqFbBZXgYbmHVTzdNpdtRaisXqk47ofDA8w3EEv08mE8JDF6iFJNcpIY6dRyusKoqhlDg";
            Keycloak keycloak = KeycloakBuilder.builder()
                    .grantType(CLIENT_CREDENTIALS)
                    .serverUrl("https://lemur-6.cloud-iam.com/auth/")
                    .realm("rhb")
                    .clientId("myserver")
                    .clientSecret("b7123273-8424-456f-a67a-3d043a40e69d")
                    .resteasyClient(new ResteasyClientBuilder().connectionPoolSize(20).build())
                    .build();

            keycloak.realm("rhb").users().countEmailVerified(true);

            List<UserRepresentation> users = keycloak.realm("rhb").users().search("keenwarrior");

            for(UserRepresentation user : users){
                System.out.println(user.getEmail());
            }
        } catch (Exception e){
            e.printStackTrace();
        }



    }
}
