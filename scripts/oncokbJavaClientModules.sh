#!/usr/bin/env bash
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
ONCOKB_PUBLIC_DOCS=${1:-https://www.oncokb.org/api/v1/v2/api-docs?group=Public%20APIs}
ONCOKB_PREMIUM_DOCS=${1:-https://www.oncokb.org/api/v1/v2/api-docs?group=Public%20APIs%20for%20Premium%20Users}
SWAGGER_CODEGEN_CLI_JAR="swagger-codegen-cli.jar"

# switch to the script directory
cd ${SCRIPT_DIR}

# only download the client if it is not already downloaded
if [ ! -f ${SWAGGER_CODEGEN_CLI_JAR} ]; then
    wget https://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.4.12/swagger-codegen-cli-2.4.12.jar  -O ${SWAGGER_CODEGEN_CLI_JAR}
fi

# remove the modules if available (otherwise some legacy methods in the test will not get removed)
# rm -rf ../genomeNexusPublicApiClient
# rm -rf ../genomeNexusInternalApiClient
rm -rf ../oncokbPublicApiClient
rm -rf ../oncokbPremiumApiClient

# generate java modules (see config json files for more details)
java -jar ${SWAGGER_CODEGEN_CLI_JAR} generate -i ${ONCOKB_PUBLIC_DOCS} -l java -c oncokbPublicApiClientConfig.json -o ../oncokbPublicApiClient
java -jar ${SWAGGER_CODEGEN_CLI_JAR} generate -i ${ONCOKB_PREMIUM_DOCS} -l java -c oncokbPremiumApiClientConfig.json -o ../oncokbPremiumApiClient
