# spring-boot-dependency-check-maven-plugin
Spring Boot project with dependency check maven plugin
Dependency-Check is an open source tool performing a best effort analysis of 3rd party dependencies; false positives and false negatives may exist in the analysis performed by the tool. 
Use of the tool and the reporting provided constitutes acceptance for use in an AS IS condition, and there are NO warranties, implied or otherwise, with regard to the analysis or its use.
 Any use of the tool and the reporting provided is at the user’s risk. 
In no event shall the copyright holder or OWASP be held liable for any damages whatsoever arising out of or in connection with the use of this tool, the analysis performed, or the resulting report.

## Plugin Configuration
```
      <plugin>
				<groupId>org.owasp</groupId>
				<artifactId>dependency-check-maven</artifactId>
				<version>7.0.4</version>
				<configuration>
					<skipProvidedScope>true</skipProvidedScope>
					<skipRuntimeScope>true</skipRuntimeScope>
					<skipSystemScope>true</skipSystemScope>
					<skipTestScope>true</skipTestScope>
					<centralAnalyzerUseCache>false</centralAnalyzerUseCache><!-- Disable non-java analysers -->
					<ossindexAnalyzerEnabled>false</ossindexAnalyzerEnabled>
					<retireJsAnalyzerEnabled>false</retireJsAnalyzerEnabled>
					<nuspecAnalyzerEnabled>false</nuspecAnalyzerEnabled>
					<assemblyAnalyzerEnabled>false
					</assemblyAnalyzerEnabled><!-- The number of hours to wait before checking for updates to the NVD, default is 4 hours -->
					<cveValidForHours>12
					</cveValidForHours><!-- This can be enabled to fail a build on a vulnerability being found -->
					<failBuildOnAnyVulnerability>false
					</failBuildOnAnyVulnerability><!-- If there is an error running the tool, this will fail the build -->
					<failOnError>true
					</failOnError><!-- This is the folder where ODC will output the reports, default is "target" -->
					<outputDirectory>target
					</outputDirectory><!-- Possible values: HTML, XML, CSV, JSON, JUNIT, SARIF, ALL -->
					<formats>
						<format>HTML</format>
						<format>JSON</format>
						<format>XML</format>
					</formats><!-- Whether the XML and JSON formatted reports should be pretty printed. -->
					<prettyPrint>true</prettyPrint>
				</configuration>
				<executions>
					<execution>
						<goals>
							<goal>check</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
 ```
