import Keycloak from 'keycloak-js'

const config = {
    url: "https://lemur-6.cloud-iam.com/auth/",
    realm: "rhb",
    clientId: "myweb"
}

const keycloak = new Keycloak(config)
 
export default keycloak;