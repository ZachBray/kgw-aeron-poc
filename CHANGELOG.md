# Change Log

## [Unreleased](https://github.com/kaazing/gateway/tree/HEAD)

[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.38...HEAD)

**Closed issues:**

- Server API Documentation section needs updating [\#219](https://github.com/kaazing/gateway/issues/219)

**Merged pull requests:**

- Forward Port Class Cast Exception fix for Hazel Cast from 4.0 [\#371](https://github.com/kaazing/gateway/pull/371) ([mjolie](https://github.com/mjolie))
- Fixing local and remote addresses of some transports [\#369](https://github.com/kaazing/gateway/pull/369) ([jitsni](https://github.com/jitsni))
- Adding round trip latency for websocket sessions\(it gives meaningful values on… [\#368](https://github.com/kaazing/gateway/pull/368) ([jitsni](https://github.com/jitsni))
- Override host header in http.proxy with hostname from \<connect\> [\#360](https://github.com/kaazing/gateway/pull/360) ([msalavastru](https://github.com/msalavastru))

## [5.0.1.38](https://github.com/kaazing/gateway/tree/5.0.1.38) (2015-12-04)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.37...5.0.1.38)

**Merged pull requests:**

- Streaming http response body [\#362](https://github.com/kaazing/gateway/pull/362) ([jitsni](https://github.com/jitsni))

## [5.0.1.37](https://github.com/kaazing/gateway/tree/5.0.1.37) (2015-12-03)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.36...5.0.1.37)

**Merged pull requests:**

- Formalized support for extension services without requiring specific type… [\#367](https://github.com/kaazing/gateway/pull/367) ([sanjay-saxena](https://github.com/sanjay-saxena))
- Provisional changes for setting the parent session for SseSession [\#366](https://github.com/kaazing/gateway/pull/366) ([sanjay-saxena](https://github.com/sanjay-saxena))
- Provisional changes for specifying the parent session of SseSession. [\#365](https://github.com/kaazing/gateway/pull/365) ([sanjay-saxena](https://github.com/sanjay-saxena))

## [5.0.1.36](https://github.com/kaazing/gateway/tree/5.0.1.36) (2015-12-01)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.35...5.0.1.36)

**Merged pull requests:**

- Added IT tests for RFC 7232 for Directory Service [\#358](https://github.com/kaazing/gateway/pull/358) ([sanjay-saxena](https://github.com/sanjay-saxena))
- RFC 7235 specification tests [\#356](https://github.com/kaazing/gateway/pull/356) ([jitsni](https://github.com/jitsni))
- If the parent session is already closed, ssl filter would be null. [\#355](https://github.com/kaazing/gateway/pull/355) ([jitsni](https://github.com/jitsni))
- Fail-fast HTTP responses while decoding HTTP version [\#354](https://github.com/kaazing/gateway/pull/354) ([jitsni](https://github.com/jitsni))
- wsn session may be null when there is an exception [\#353](https://github.com/kaazing/gateway/pull/353) ([jitsni](https://github.com/jitsni))
- Throwing an exception at gateway startup when 'pipe://' URL is used with path [\#352](https://github.com/kaazing/gateway/pull/352) ([msalavastru](https://github.com/msalavastru))
- Adding tests for http proxy sending 504 status code [\#349](https://github.com/kaazing/gateway/pull/349) ([jitsni](https://github.com/jitsni))
- Added x-kaazing-ping-pong WSN robot tests [\#338](https://github.com/kaazing/gateway/pull/338) ([mgherghe](https://github.com/mgherghe))
- Remove/block use of accept in properties section of broadcast service  [\#335](https://github.com/kaazing/gateway/pull/335) ([mjolie](https://github.com/mjolie))

## [5.0.1.35](https://github.com/kaazing/gateway/tree/5.0.1.35) (2015-11-05)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.34...5.0.1.35)

**Merged pull requests:**

- Cluster bug [\#350](https://github.com/kaazing/gateway/pull/350) ([mjolie](https://github.com/mjolie))
- HTTP HEAD method resources may have Content-Length without content [\#348](https://github.com/kaazing/gateway/pull/348) ([jitsni](https://github.com/jitsni))
- Fix license headers in two recently added test files in transport/wseb. [\#344](https://github.com/kaazing/gateway/pull/344) ([cmebarrow](https://github.com/cmebarrow))
- Really fix the license header in HttpPathMatchingFilter.java [\#343](https://github.com/kaazing/gateway/pull/343) ([cmebarrow](https://github.com/cmebarrow))
- Fix year in license header in HttpPathMatchingFilter.java [\#342](https://github.com/kaazing/gateway/pull/342) ([cmebarrow](https://github.com/cmebarrow))
- Added WSN x-kaazing-idle-timeout k3po test scenarios [\#340](https://github.com/kaazing/gateway/pull/340) ([irina-mitrea-luxoft](https://github.com/irina-mitrea-luxoft))
- HttpBindings comparator didn't check transport's origin [\#319](https://github.com/kaazing/gateway/pull/319) ([jitsni](https://github.com/jitsni))
- upstream/downstream requests should get 404 \(instead of 401\)  [\#257](https://github.com/kaazing/gateway/pull/257) ([jitsni](https://github.com/jitsni))

## [5.0.1.34](https://github.com/kaazing/gateway/tree/5.0.1.34) (2015-10-09)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.33...5.0.1.34)

**Merged pull requests:**

- Upgrade k3po version from 2.0.1 to latest version 2.1.0. [\#341](https://github.com/kaazing/gateway/pull/341) ([cmebarrow](https://github.com/cmebarrow))

## [5.0.1.33](https://github.com/kaazing/gateway/tree/5.0.1.33) (2015-10-08)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.32...5.0.1.33)

**Merged pull requests:**

- Update configuration of license-maven-plugin, add/update license as needed [\#339](https://github.com/kaazing/gateway/pull/339) ([ahousing](https://github.com/ahousing))
- Issue \#508, Issue \#151: Forward port memory leak fixes and the abilit… [\#336](https://github.com/kaazing/gateway/pull/336) ([sanjay-saxena](https://github.com/sanjay-saxena))
- Refactored tests rules in order for time out to give K3po diffs [\#334](https://github.com/kaazing/gateway/pull/334) ([dpwspoon](https://github.com/dpwspoon))
- Forward port: report "Early termination of IO session" and "Network collectivity has been lost [\#330](https://github.com/kaazing/gateway/pull/330) ([cmebarrow](https://github.com/cmebarrow))

## [5.0.1.32](https://github.com/kaazing/gateway/tree/5.0.1.32) (2015-09-22)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.31...5.0.1.32)

**Fixed bugs:**

- sporadic failure of wsn build: WsnConnectorTest.shouldNotHangOnToHttpConnectSessionsWhenEstablishingAndTearingDownWsnConnectorSessions [\#162](https://github.com/kaazing/gateway/issues/162)

**Merged pull requests:**

- upgrade handler is not found during ws connect [\#328](https://github.com/kaazing/gateway/pull/328) ([jitsni](https://github.com/jitsni))
- Gateway enhancements for improved extensibility [\#318](https://github.com/kaazing/gateway/pull/318) ([dpwspoon](https://github.com/dpwspoon))
- change minimum required jdk version from 1.7.0\_21 to 1.8.0 [\#317](https://github.com/kaazing/gateway/pull/317) ([chao-sun-kaazing](https://github.com/chao-sun-kaazing))
- Cleanup: remove unnecessary boxing, using multi-catch [\#304](https://github.com/kaazing/gateway/pull/304) ([jitsni](https://github.com/jitsni))
- deprecating Application Negotiate [\#299](https://github.com/kaazing/gateway/pull/299) ([michaelcretzman](https://github.com/michaelcretzman))

## [5.0.1.31](https://github.com/kaazing/gateway/tree/5.0.1.31) (2015-09-10)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.30...5.0.1.31)

**Closed issues:**

- Rename http.keepalive.max.connections to http.keepalive.connections in Gateway configuration [\#209](https://github.com/kaazing/gateway/issues/209)

**Merged pull requests:**

- IP filtering doc [\#305](https://github.com/kaazing/gateway/pull/305) ([michaelcretzman](https://github.com/michaelcretzman))
- Add Kerberos callback registrar function  [\#302](https://github.com/kaazing/gateway/pull/302) ([chao-sun-kaazing](https://github.com/chao-sun-kaazing))
- Issue\# 472: Added specification tests for WSN Connector. [\#301](https://github.com/kaazing/gateway/pull/301) ([sanjay-saxena](https://github.com/sanjay-saxena))
- Remove wsr from gateway [\#297](https://github.com/kaazing/gateway/pull/297) ([mjolie](https://github.com/mjolie))
- Added support for the new MMF format [\#275](https://github.com/kaazing/gateway/pull/275) ([irina-mitrea-luxoft](https://github.com/irina-mitrea-luxoft))
- wse doesn't write RECONNECT and CLOSE frames when the channel is not connected [\#268](https://github.com/kaazing/gateway/pull/268) ([jitsni](https://github.com/jitsni))

## [5.0.1.30](https://github.com/kaazing/gateway/tree/5.0.1.30) (2015-08-28)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.29...5.0.1.30)

**Fixed bugs:**

- TravisCI build tests hanging [\#282](https://github.com/kaazing/gateway/issues/282)

**Merged pull requests:**

- Fixed issue in duplicate jar detection where list was not cleared on … [\#296](https://github.com/kaazing/gateway/pull/296) ([dpwspoon](https://github.com/dpwspoon))
- added link to Release Notes [\#295](https://github.com/kaazing/gateway/pull/295) ([michaelcretzman](https://github.com/michaelcretzman))
- Feature/config translator ii [\#294](https://github.com/kaazing/gateway/pull/294) ([mjolie](https://github.com/mjolie))
- Remove code for KSESSIONID and "recycle" authorization mode [\#293](https://github.com/kaazing/gateway/pull/293) ([sanjay-saxena](https://github.com/sanjay-saxena))
- Trying to address travis gateway build failures. [\#291](https://github.com/kaazing/gateway/pull/291) ([cmebarrow](https://github.com/cmebarrow))
- \(\#267\) Ignore OcspIT.testGoodCertificate since we have not yet found … [\#290](https://github.com/kaazing/gateway/pull/290) ([cmebarrow](https://github.com/cmebarrow))
- Adding Method execution trace, and timeout rules [\#289](https://github.com/kaazing/gateway/pull/289) ([jitsni](https://github.com/jitsni))
- Travis ci failures [\#286](https://github.com/kaazing/gateway/pull/286) ([dpwspoon](https://github.com/dpwspoon))
- Wseb connector sending X-WebSocket-Protocol header [\#284](https://github.com/kaazing/gateway/pull/284) ([jitsni](https://github.com/jitsni))
- Binding explicitly for .../;api endpoints for wsn and wseb cases [\#280](https://github.com/kaazing/gateway/pull/280) ([jitsni](https://github.com/jitsni))
- Change http.keepalive.max.connections to http.keepalive.connections [\#278](https://github.com/kaazing/gateway/pull/278) ([jitsni](https://github.com/jitsni))
- Adds jar version to manifest entry such that it can be reported when duplicate jars are [\#276](https://github.com/kaazing/gateway/pull/276) ([dpwspoon](https://github.com/dpwspoon))

## [5.0.1.29](https://github.com/kaazing/gateway/tree/5.0.1.29) (2015-08-19)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.28...5.0.1.29)

**Fixed bugs:**

- Build errors on travis  [\#264](https://github.com/kaazing/gateway/issues/264)
- remove HTML from Glossary [\#250](https://github.com/kaazing/gateway/issues/250)
- KGS-976: UP: sporadic error connecting Command Center to JMS 4.0.6 Dev / JMS 4.0.7 Prod [\#226](https://github.com/kaazing/gateway/issues/226)
- \(doc\) Admin guide is missing maximum-age [\#145](https://github.com/kaazing/gateway/issues/145)

**Closed issues:**

- Remove protocol injection topics again [\#228](https://github.com/kaazing/gateway/issues/228)
- Update http.keepalive.timeout example to use time unit [\#224](https://github.com/kaazing/gateway/issues/224)
- \(doc\) Remove reference to GWT [\#223](https://github.com/kaazing/gateway/issues/223)
- Remove the Session \<type\> from gateway documentation  [\#214](https://github.com/kaazing/gateway/issues/214)
- AgronaMonitoringEntityFactoryTest fails the build \(on Mac OS x\) [\#171](https://github.com/kaazing/gateway/issues/171)
- \(doc\) Add connect options to service defaults description [\#143](https://github.com/kaazing/gateway/issues/143)
- \(doc\) Add links to admin-reference/p\_config\_multicast.md [\#134](https://github.com/kaazing/gateway/issues/134)

**Merged pull requests:**

- Adding info message when wsn is falling back to wse [\#283](https://github.com/kaazing/gateway/pull/283) ([jitsni](https://github.com/jitsni))
- Fixing NPE when connector is null [\#281](https://github.com/kaazing/gateway/pull/281) ([jitsni](https://github.com/jitsni))
- Forgot to commit acceptor rule for wsn [\#272](https://github.com/kaazing/gateway/pull/272) ([jitsni](https://github.com/jitsni))
- Add wsn spec tests [\#270](https://github.com/kaazing/gateway/pull/270) ([jitsni](https://github.com/jitsni))
- Resolves \#264 [\#265](https://github.com/kaazing/gateway/pull/265) ([dpwspoon](https://github.com/dpwspoon))
- Added ability to filter IP addresses [\#263](https://github.com/kaazing/gateway/pull/263) ([sanjay-saxena](https://github.com/sanjay-saxena))
- fixing md for html I hope [\#261](https://github.com/kaazing/gateway/pull/261) ([michaelcretzman](https://github.com/michaelcretzman))
- output formatting error [\#260](https://github.com/kaazing/gateway/pull/260) ([michaelcretzman](https://github.com/michaelcretzman))
- fixing link errors [\#259](https://github.com/kaazing/gateway/pull/259) ([michaelcretzman](https://github.com/michaelcretzman))
- Format errors [\#258](https://github.com/kaazing/gateway/pull/258) ([michaelcretzman](https://github.com/michaelcretzman))
- Adding a wse balancer test [\#256](https://github.com/kaazing/gateway/pull/256) ([jitsni](https://github.com/jitsni))
- Update kaazing-glossary.md [\#252](https://github.com/kaazing/gateway/pull/252) ([michaelcretzman](https://github.com/michaelcretzman))
- Remove html from glossary \#250 [\#251](https://github.com/kaazing/gateway/pull/251) ([michaelcretzman](https://github.com/michaelcretzman))
- doc link changes [\#249](https://github.com/kaazing/gateway/pull/249) ([chadpowers](https://github.com/chadpowers))
- Fix links [\#248](https://github.com/kaazing/gateway/pull/248) ([michaelcretzman](https://github.com/michaelcretzman))
- Link errors [\#247](https://github.com/kaazing/gateway/pull/247) ([michaelcretzman](https://github.com/michaelcretzman))
- Update r\_configure\_gateway\_service.md [\#242](https://github.com/kaazing/gateway/pull/242) ([michaelcretzman](https://github.com/michaelcretzman))
- Update r\_configure\_gateway\_element\_skeleton.md [\#241](https://github.com/kaazing/gateway/pull/241) ([michaelcretzman](https://github.com/michaelcretzman))
- APNs removed [\#240](https://github.com/kaazing/gateway/pull/240) ([michaelcretzman](https://github.com/michaelcretzman))
-  Remove protocol injection [\#239](https://github.com/kaazing/gateway/pull/239) ([michaelcretzman](https://github.com/michaelcretzman))
- Link errors [\#238](https://github.com/kaazing/gateway/pull/238) ([michaelcretzman](https://github.com/michaelcretzman))
- Add tcp spec tests [\#235](https://github.com/kaazing/gateway/pull/235) ([chadpowers](https://github.com/chadpowers))
- APNs removed [\#233](https://github.com/kaazing/gateway/pull/233) ([michaelcretzman](https://github.com/michaelcretzman))
- Port OOM bug fix on JMX from gateway 4.0 to 5.0 [\#232](https://github.com/kaazing/gateway/pull/232) ([mgherghe](https://github.com/mgherghe))
- Configuration incorrect for ticket granting gateway \#26 [\#231](https://github.com/kaazing/gateway/pull/231) ([michaelcretzman](https://github.com/michaelcretzman))
- Added SPI note for issue \#116 [\#229](https://github.com/kaazing/gateway/pull/229) ([vjwang](https://github.com/vjwang))
- fixed broken links [\#227](https://github.com/kaazing/gateway/pull/227) ([michaelcretzman](https://github.com/michaelcretzman))
- Fixed nits in http.proxy doc [\#225](https://github.com/kaazing/gateway/pull/225) ([veschup](https://github.com/veschup))
- Added changes for supporting multiple gateways on the same host and merged refactoring from Marina's fork \(removed StringManager and latestException\) [\#222](https://github.com/kaazing/gateway/pull/222) ([irina-mitrea-luxoft](https://github.com/irina-mitrea-luxoft))
- Remove the Session service \(\<type\>\) from gateway documentation [\#218](https://github.com/kaazing/gateway/pull/218) ([veschup](https://github.com/veschup))
- Removed breadcrumbs. [\#217](https://github.com/kaazing/gateway/pull/217) ([chadpowers](https://github.com/chadpowers))
- Updated upgrade guide [\#216](https://github.com/kaazing/gateway/pull/216) ([vjwang](https://github.com/vjwang))
- Upstream and downstream shouldn't have to go through authentication. [\#212](https://github.com/kaazing/gateway/pull/212) ([jitsni](https://github.com/jitsni))
- wse create binding doesn't include ;e or ;e/ct  etc. [\#210](https://github.com/kaazing/gateway/pull/210) ([jitsni](https://github.com/jitsni))
- Have the cobertura build happen during normal building rather than during after\_success [\#207](https://github.com/kaazing/gateway/pull/207) ([ahousing](https://github.com/ahousing))

## [5.0.1.28](https://github.com/kaazing/gateway/tree/5.0.1.28) (2015-06-30)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.27...5.0.1.28)

**Closed issues:**

-  Create AmqpProxyServiceExtensionSpi in gateway [\#159](https://github.com/kaazing/gateway/issues/159)

**Merged pull requests:**

- Tcp extensions API and implementation [\#213](https://github.com/kaazing/gateway/pull/213) ([cmebarrow](https://github.com/cmebarrow))
- \#203 Avoid syntax like read /:.\*/ "\n" in transport/sse k3po test scr… [\#211](https://github.com/kaazing/gateway/pull/211) ([cmebarrow](https://github.com/cmebarrow))
- Removing after moving file to enterprise.gateway [\#206](https://github.com/kaazing/gateway/pull/206) ([vjwang](https://github.com/vjwang))
- adding link to Redis doc and EE graphic [\#204](https://github.com/kaazing/gateway/pull/204) ([michaelcretzman](https://github.com/michaelcretzman))
- Eliminate ugly exceptions stacks in build output by removing calls to… [\#202](https://github.com/kaazing/gateway/pull/202) ([cmebarrow](https://github.com/cmebarrow))
- Removed docker build to unstable-gateway docker hub [\#201](https://github.com/kaazing/gateway/pull/201) ([dpwspoon](https://github.com/dpwspoon))
- Update Doc links [\#200](https://github.com/kaazing/gateway/pull/200) ([chadpowers](https://github.com/chadpowers))
- Fixed \#94 for AMQP Identity Promotion [\#199](https://github.com/kaazing/gateway/pull/199) ([vjwang](https://github.com/vjwang))
- Fixing two issues with WsnConnector impl w.r.t handshake [\#198](https://github.com/kaazing/gateway/pull/198) ([jitsni](https://github.com/jitsni))
- Adding a helper class to log exceptions [\#196](https://github.com/kaazing/gateway/pull/196) ([jitsni](https://github.com/jitsni))
- Adding the glossary in MD format [\#195](https://github.com/kaazing/gateway/pull/195) ([vjwang](https://github.com/vjwang))
- Add JMS entries into index.md and backed out JMX updates from monitoring topics [\#194](https://github.com/kaazing/gateway/pull/194) ([veschup](https://github.com/veschup))
- Fix for unit test in Mac OS [\#190](https://github.com/kaazing/gateway/pull/190) ([irina-mitrea-luxoft](https://github.com/irina-mitrea-luxoft))

## [5.0.1.27](https://github.com/kaazing/gateway/tree/5.0.1.27) (2015-06-15)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.26...5.0.1.27)

**Fixed bugs:**

- Update to latest community to consume fixes for animal sniffer plugin [\#176](https://github.com/kaazing/gateway/issues/176)
- Log files are overflowing 4MB maximum on travis when tests fail [\#166](https://github.com/kaazing/gateway/issues/166)

**Closed issues:**

- Long start time on systems with low entropy \(containers\) due to calls to getSecureBytes. [\#167](https://github.com/kaazing/gateway/issues/167)
- \(doc\) Doc markdown needs to use "bash" for the code type [\#124](https://github.com/kaazing/gateway/issues/124)

**Merged pull requests:**

- Fix up the timing of when proxy service extensions are invoked \(initAcceptSession\) [\#192](https://github.com/kaazing/gateway/pull/192) ([krismcqueen](https://github.com/krismcqueen))
- update to the latest community [\#191](https://github.com/kaazing/gateway/pull/191) ([krismcqueen](https://github.com/krismcqueen))
- Deleting file because it was moved [\#189](https://github.com/kaazing/gateway/pull/189) ([michaelcretzman](https://github.com/michaelcretzman))
- added JMS troubleshooting links to topic [\#188](https://github.com/kaazing/gateway/pull/188) ([michaelcretzman](https://github.com/michaelcretzman))
- Expose extension point for amqp.proxy service [\#186](https://github.com/kaazing/gateway/pull/186) ([krismcqueen](https://github.com/krismcqueen))
- Added changes for supporting additional service session-level counters [\#184](https://github.com/kaazing/gateway/pull/184) ([irina-mitrea-luxoft](https://github.com/irina-mitrea-luxoft))
- Remove or update svn references [\#181](https://github.com/kaazing/gateway/pull/181) ([ahousing](https://github.com/ahousing))
- Added reference to kaazing gateway on Docker Hub. [\#180](https://github.com/kaazing/gateway/pull/180) ([brennangaunce](https://github.com/brennangaunce))
-  http.keepalive.max.connections config to cache http idle connections. [\#178](https://github.com/kaazing/gateway/pull/178) ([jitsni](https://github.com/jitsni))
- kaazing/gateway\#176  Update to latest community to get animal-sniffer… [\#177](https://github.com/kaazing/gateway/pull/177) ([krismcqueen](https://github.com/krismcqueen))
- Move Enterprise Shield docs [\#174](https://github.com/kaazing/gateway/pull/174) ([vjwang](https://github.com/vjwang))
- Ignored test that is buggy on mac os, see https://github.com/kaazing/… [\#172](https://github.com/kaazing/gateway/pull/172) ([dpwspoon](https://github.com/dpwspoon))
- Resolves kaazing/gateway\#167: slow start ups on machines with low entropy [\#169](https://github.com/kaazing/gateway/pull/169) ([dpwspoon](https://github.com/dpwspoon))
- Added quiet flag to mvn builds in travis [\#168](https://github.com/kaazing/gateway/pull/168) ([dpwspoon](https://github.com/dpwspoon))
- Updated README.md with docker instructions [\#165](https://github.com/kaazing/gateway/pull/165) ([brennangaunce](https://github.com/brennangaunce))
- Move truststore to its own repository, gateway.truststore [\#163](https://github.com/kaazing/gateway/pull/163) ([ahousing](https://github.com/ahousing))
- Removed empty folder/subproject [\#160](https://github.com/kaazing/gateway/pull/160) ([dpwspoon](https://github.com/dpwspoon))
- Updates to allow build for java 8 build, and updated readme to say th… [\#158](https://github.com/kaazing/gateway/pull/158) ([dpwspoon](https://github.com/dpwspoon))
- New ws extension spi [\#155](https://github.com/kaazing/gateway/pull/155) ([cmebarrow](https://github.com/cmebarrow))
- New Enterprise Shield content and graphics [\#148](https://github.com/kaazing/gateway/pull/148) ([veschup](https://github.com/veschup))
- Adding gateway counters to Agrona [\#133](https://github.com/kaazing/gateway/pull/133) ([irina-mitrea-luxoft](https://github.com/irina-mitrea-luxoft))

## [5.0.1.26](https://github.com/kaazing/gateway/tree/5.0.1.26) (2015-05-26)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.25...5.0.1.26)

**Closed issues:**

- Allow ProxyService extensions [\#130](https://github.com/kaazing/gateway/issues/130)
- Allow NIOSocketConnector to use a proxy transport if configured [\#122](https://github.com/kaazing/gateway/issues/122)

**Merged pull requests:**

- HTTP response without Content-Length or chunked encoding causes parsing loop [\#147](https://github.com/kaazing/gateway/pull/147) ([jitsni](https://github.com/jitsni))

## [5.0.1.25](https://github.com/kaazing/gateway/tree/5.0.1.25) (2015-05-21)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.24...5.0.1.25)

**Fixed bugs:**

- testSendLargeFile\(org.apache.mina.transport.socket.nio.NioFileRegionTest\) occasionally failing [\#150](https://github.com/kaazing/gateway/issues/150)

**Merged pull requests:**

- Use localhost for binding in AbstractFileRegionTest.java [\#151](https://github.com/kaazing/gateway/pull/151) ([dpwspoon](https://github.com/dpwspoon))
- Renamed files and updated references [\#149](https://github.com/kaazing/gateway/pull/149) ([vjwang](https://github.com/vjwang))
- Added module that builds a docker image from a release [\#139](https://github.com/kaazing/gateway/pull/139) ([dpwspoon](https://github.com/dpwspoon))
- Wseb transport session [\#137](https://github.com/kaazing/gateway/pull/137) ([cmebarrow](https://github.com/cmebarrow))

## [5.0.1.24](https://github.com/kaazing/gateway/tree/5.0.1.24) (2015-05-20)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.23...5.0.1.24)

**Fixed bugs:**

- Test is using ephemeral port to bind [\#114](https://github.com/kaazing/gateway/issues/114)
- ws.inactivity.timeout occurring on incorrect WebSocket layer when there are multiple WebSocket layers in the stack [\#62](https://github.com/kaazing/gateway/issues/62)
- JmxManagementServiceHandlerTest\#testNoJMXBindingNameConflictsOnMultiServicesUsingSameAccept failing and has been ignored [\#32](https://github.com/kaazing/gateway/issues/32)

**Closed issues:**

- \(doc\) Typos [\#142](https://github.com/kaazing/gateway/issues/142)
- SseSameOriginIT sseIe8HttpxeConnectAndGetData fails intermittently [\#141](https://github.com/kaazing/gateway/issues/141)
- Ensure schemes are resolved in a dynamic manner [\#72](https://github.com/kaazing/gateway/issues/72)
- accept-options / connect options should be "sequence" to allows extenstions  [\#69](https://github.com/kaazing/gateway/issues/69)

**Merged pull requests:**

- Removed the explicit closing from the test as it should be unspecifie… [\#144](https://github.com/kaazing/gateway/pull/144) ([dpwspoon](https://github.com/dpwspoon))
- Update ts\_security.md [\#140](https://github.com/kaazing/gateway/pull/140) ([michaelcretzman](https://github.com/michaelcretzman))
- Fix failures in SseCrossOriginIT [\#138](https://github.com/kaazing/gateway/pull/138) ([cmebarrow](https://github.com/cmebarrow))
- Fixed an issue where gateway wasn't flushing PING frame followed by RECONNECT frame in long polling mode [\#135](https://github.com/kaazing/gateway/pull/135) ([pkhanal](https://github.com/pkhanal))
- Embedded Gateway docs [\#132](https://github.com/kaazing/gateway/pull/132) ([vjwang](https://github.com/vjwang))
- Allow proxy service to be extended [\#131](https://github.com/kaazing/gateway/pull/131) ([krismcqueen](https://github.com/krismcqueen))
- For \#273 - many fixes to MD [\#129](https://github.com/kaazing/gateway/pull/129) ([veschup](https://github.com/veschup))
- EE graphic for docs [\#127](https://github.com/kaazing/gateway/pull/127) ([vjwang](https://github.com/vjwang))
- Community Edition server images and samples [\#126](https://github.com/kaazing/gateway/pull/126) ([vjwang](https://github.com/vjwang))
- Cleanup [\#125](https://github.com/kaazing/gateway/pull/125) ([jitsni](https://github.com/jitsni))
- Allow a proxy.connector to be injected into the N… [\#123](https://github.com/kaazing/gateway/pull/123) ([krismcqueen](https://github.com/krismcqueen))
- Updated doc references and typos in the README.md [\#119](https://github.com/kaazing/gateway/pull/119) ([vjwang](https://github.com/vjwang))
- Feature/md docs [\#117](https://github.com/kaazing/gateway/pull/117) ([vjwang](https://github.com/vjwang))
- Restore strongly typed accept-options / connect-options [\#116](https://github.com/kaazing/gateway/pull/116) ([krismcqueen](https://github.com/krismcqueen))
- resolves \#114 and better describes xsd [\#115](https://github.com/kaazing/gateway/pull/115) ([dpwspoon](https://github.com/dpwspoon))
- Many misc fixes during verification pass [\#113](https://github.com/kaazing/gateway/pull/113) ([veschup](https://github.com/veschup))
- Feature/new ws extension api, ordering of extensions [\#112](https://github.com/kaazing/gateway/pull/112) ([dpwspoon](https://github.com/dpwspoon))
- Add resource.address.httpxe test dependency to server\pom.xml since it i... [\#111](https://github.com/kaazing/gateway/pull/111) ([cmebarrow](https://github.com/cmebarrow))
- Cleanup [\#110](https://github.com/kaazing/gateway/pull/110) ([jitsni](https://github.com/jitsni))
- Let the origin server header flow through http.proxy service [\#109](https://github.com/kaazing/gateway/pull/109) ([jitsni](https://github.com/jitsni))
- Writing of HTTP server header is controlled by an accept option. [\#108](https://github.com/kaazing/gateway/pull/108) ([jitsni](https://github.com/jitsni))
- Removing hop-by-hop headers in response messages too. Adding a test cas... [\#107](https://github.com/kaazing/gateway/pull/107) ([jitsni](https://github.com/jitsni))
- Exposing accept-options and connect-options in the management layer... [\#105](https://github.com/kaazing/gateway/pull/105) ([krismcqueen](https://github.com/krismcqueen))
- No use in declaring static final methods. Removing final keyword [\#104](https://github.com/kaazing/gateway/pull/104) ([jitsni](https://github.com/jitsni))
- WebSocketExtensionFactory: implement method negotiateWebSocketExtensions... [\#103](https://github.com/kaazing/gateway/pull/103) ([dpwspoon](https://github.com/dpwspoon))
- fixed remaining gateway files [\#102](https://github.com/kaazing/gateway/pull/102) ([michaelcretzman](https://github.com/michaelcretzman))
- New ws extension api: preliminary proposal [\#101](https://github.com/kaazing/gateway/pull/101) ([cmebarrow](https://github.com/cmebarrow))
- updated admin-reference, about, high-availability [\#100](https://github.com/kaazing/gateway/pull/100) ([michaelcretzman](https://github.com/michaelcretzman))
- http.proxy supports upgrade [\#98](https://github.com/kaazing/gateway/pull/98) ([jitsni](https://github.com/jitsni))

## [5.0.1.23](https://github.com/kaazing/gateway/tree/5.0.1.23) (2015-04-17)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.22...5.0.1.23)

**Closed issues:**

- Enterprise Shield +1 connection fails when using different transport URIs over SOCKS [\#96](https://github.com/kaazing/gateway/issues/96)

**Merged pull requests:**

- Fix how ws.inactivity.timeout was applied though accept-options [\#97](https://github.com/kaazing/gateway/pull/97) ([krismcqueen](https://github.com/krismcqueen))
- Changes for apns ws extension [\#95](https://github.com/kaazing/gateway/pull/95) ([cmebarrow](https://github.com/cmebarrow))
- Update Accept/Connect Options to be generic such that they can be extended [\#94](https://github.com/kaazing/gateway/pull/94) ([krismcqueen](https://github.com/krismcqueen))
- Minor cleanup : removing unnecessary casts, keywords etc [\#93](https://github.com/kaazing/gateway/pull/93) ([jitsni](https://github.com/jitsni))
- Removing unused imports [\#92](https://github.com/kaazing/gateway/pull/92) ([jitsni](https://github.com/jitsni))
- Http.proxy.persistence [\#88](https://github.com/kaazing/gateway/pull/88) ([jitsni](https://github.com/jitsni))

## [5.0.1.22](https://github.com/kaazing/gateway/tree/5.0.1.22) (2015-04-09)
[Full Changelog](https://github.com/kaazing/gateway/compare/5.0.1.21...5.0.1.22)

**Implemented enhancements:**

- Configuration doesn't allow \<connect-options\> in \<service-defaults\> [\#64](https://github.com/kaazing/gateway/issues/64)

**Fixed bugs:**

- SseSameOriginIT.sseIe8HttpxeConnectAndGetData sometimes fails [\#60](https://github.com/kaazing/gateway/issues/60)
- WsebTransportIT.testEchoAlignedDownstream sporadically failing [\#41](https://github.com/kaazing/gateway/issues/41)
- WsnConnectorTest.shouldNotHangOnToHttpConnectSessionsWhenEstablishingAndTearingDownWsnConnectorSessions sporadically hanging  [\#37](https://github.com/kaazing/gateway/issues/37)

**Closed issues:**

- Use sequence numbers to detect out of order requests in wseb [\#73](https://github.com/kaazing/gateway/issues/73)
- Add Visitor to reorder elements in accept/connect options [\#70](https://github.com/kaazing/gateway/issues/70)

**Merged pull requests:**

- Add a connect\(ResourceAddress...\) variant to ServiceContext. [\#91](https://github.com/kaazing/gateway/pull/91) ([cmebarrow](https://github.com/cmebarrow))
- barriers are not required in these scripts [\#90](https://github.com/kaazing/gateway/pull/90) ([jitsni](https://github.com/jitsni))
- Added test for service defaults getting parsed from xml, and generified ... [\#89](https://github.com/kaazing/gateway/pull/89) ([dpwspoon](https://github.com/dpwspoon))
- Allow service-defaults to allow connect options [\#87](https://github.com/kaazing/gateway/pull/87) ([dpwspoon](https://github.com/dpwspoon))
- Added timeout back into WsnConnectorTest [\#86](https://github.com/kaazing/gateway/pull/86) ([dpwspoon](https://github.com/dpwspoon))

## [5.0.1.21](https://github.com/kaazing/gateway/tree/5.0.1.21) (2015-04-03)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.1.20...5.0.1.21)

**Fixed bugs:**

- Build failed in mina.netty: NioDatagramConnectorExIT [\#67](https://github.com/kaazing/gateway/issues/67)

**Closed issues:**

- Create maven BOM of gateway [\#75](https://github.com/kaazing/gateway/issues/75)

**Merged pull requests:**

- Updated to latest k3po [\#85](https://github.com/kaazing/gateway/pull/85) ([dpwspoon](https://github.com/dpwspoon))
- Add dependencies to the bom so it includes everything in assembly, remove duplicate version numbers [\#84](https://github.com/kaazing/gateway/pull/84) ([cmebarrow](https://github.com/cmebarrow))
- Add support for Docker via $hostname property, config from url [\#83](https://github.com/kaazing/gateway/pull/83) ([dpwspoon](https://github.com/dpwspoon))
- Wseb sequencing [\#82](https://github.com/kaazing/gateway/pull/82) ([jitsni](https://github.com/jitsni))
- Added exec to linux startup script [\#81](https://github.com/kaazing/gateway/pull/81) ([dpwspoon](https://github.com/dpwspoon))

## [gateway.distribution-5.0.1.20](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.1.20) (2015-03-26)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.1.19...gateway.distribution-5.0.1.20)

**Fixed bugs:**

- gateway.transport.wsn: IdleTimeoutExtensionPongsIT.shouldGetPongsFromidleTimeoutExtensionWhenWriterIdle spurious failures [\#34](https://github.com/kaazing/gateway/issues/34)
- gateway.transport.wsn: UnresolvableHostnameIT\#connectingOnService1ShouldNotGetAccessToService2 is failing on travis [\#33](https://github.com/kaazing/gateway/issues/33)
- Small tweaks for readme [\#18](https://github.com/kaazing/gateway/issues/18)
- Incorrect port number in README.md [\#15](https://github.com/kaazing/gateway/issues/15)
- Incorrect filenames in README.md [\#14](https://github.com/kaazing/gateway/issues/14)

**Closed issues:**

- transport.wsn.UnresolvableHostnameIT [\#59](https://github.com/kaazing/gateway/issues/59)
- Ensure Subject gets correctly propagated up the transport layers using the new get/setSubject methods [\#55](https://github.com/kaazing/gateway/issues/55)
- Add IoSessionEx methods to store and get Subject and listen for subject changes [\#52](https://github.com/kaazing/gateway/issues/52)
- Gateway will not start up using Azul zing JVM [\#49](https://github.com/kaazing/gateway/issues/49)
- Integration tests failing in HTTP directory service [\#47](https://github.com/kaazing/gateway/issues/47)
- Importing all Gateway modules into eclipse results in many errors "Plugin execution not covered by lifecycle configuration..." [\#44](https://github.com/kaazing/gateway/issues/44)
- gateway.client.javascript.bridge only builds with clean do to unpack-bower plugin [\#35](https://github.com/kaazing/gateway/issues/35)
- Sslv3Test failing in latest JDK and have been ignored [\#31](https://github.com/kaazing/gateway/issues/31)
- git also required for cloning [\#10](https://github.com/kaazing/gateway/issues/10)
- \[bugout\] npm no longer required [\#9](https://github.com/kaazing/gateway/issues/9)

**Merged pull requests:**

- Changed packaging type to pom to signal no real artifact is uploaded to ... [\#78](https://github.com/kaazing/gateway/pull/78) ([dpwspoon](https://github.com/dpwspoon))
- Removed windows newlines [\#76](https://github.com/kaazing/gateway/pull/76) ([dpwspoon](https://github.com/dpwspoon))
- \#67 Adjust an expectation in NioDatagramConnectorExIT to avoid a sporadi... [\#74](https://github.com/kaazing/gateway/pull/74) ([cmebarrow](https://github.com/cmebarrow))
- Misc minor code changes [\#68](https://github.com/kaazing/gateway/pull/68) ([jitsni](https://github.com/jitsni))
- Minor clean up work renaming of classes and updating/adding JavaDoc [\#66](https://github.com/kaazing/gateway/pull/66) ([dpwspoon](https://github.com/dpwspoon))
- Added coveralls setup to pom and .travis [\#65](https://github.com/kaazing/gateway/pull/65) ([dpwspoon](https://github.com/dpwspoon))
- Transport fixes from 4.0 [\#61](https://github.com/kaazing/gateway/pull/61) ([cmebarrow](https://github.com/cmebarrow))
- \#55 Ensure Subject gets correctly propagated up the transport layers [\#57](https://github.com/kaazing/gateway/pull/57) ([cmebarrow](https://github.com/cmebarrow))
- http.proxy service implementation [\#56](https://github.com/kaazing/gateway/pull/56) ([jitsni](https://github.com/jitsni))
- \#52: add IoSessionEx APIs to get and set Subject and listen for Subject changes [\#54](https://github.com/kaazing/gateway/pull/54) ([cmebarrow](https://github.com/cmebarrow))
- \#49: allow Gateway to start using Azul Zing JVM by not checking java poi... [\#50](https://github.com/kaazing/gateway/pull/50) ([cmebarrow](https://github.com/cmebarrow))
- Integration tests failing in HTTP directory service [\#48](https://github.com/kaazing/gateway/pull/48) ([cmebarrow](https://github.com/cmebarrow))
- Renamed artifact id of gateway.distribution [\#46](https://github.com/kaazing/gateway/pull/46) ([dpwspoon](https://github.com/dpwspoon))
- Add m2e lifecycle-mapping configurations to ignore unsupported plug-ins [\#45](https://github.com/kaazing/gateway/pull/45) ([cmebarrow](https://github.com/cmebarrow))
- Deleted test that is no longer needed due to Threading model change [\#43](https://github.com/kaazing/gateway/pull/43) ([dpwspoon](https://github.com/dpwspoon))
- Enabling SSLv3 via security property for the test [\#42](https://github.com/kaazing/gateway/pull/42) ([jitsni](https://github.com/jitsni))
- Removed gateway prefix in submodules [\#40](https://github.com/kaazing/gateway/pull/40) ([dpwspoon](https://github.com/dpwspoon))
- Update to latest robot to avoid race conditions in integration-tests [\#39](https://github.com/kaazing/gateway/pull/39) ([krismcqueen](https://github.com/krismcqueen))
- Set version at develop-SNAPSHOT. [\#38](https://github.com/kaazing/gateway/pull/38) ([dpwspoon](https://github.com/dpwspoon))
- Removed bower.json and package.json from gateway.distribution.  Fixed bu... [\#29](https://github.com/kaazing/gateway/pull/29) ([dpwspoon](https://github.com/dpwspoon))
- Consolidated gateway repositories [\#28](https://github.com/kaazing/gateway/pull/28) ([dpwspoon](https://github.com/dpwspoon))
- Added .travis.yml and badge to README.md [\#26](https://github.com/kaazing/gateway/pull/26) ([dpwspoon](https://github.com/dpwspoon))
- Add a Gitter chat badge to README.md [\#21](https://github.com/kaazing/gateway/pull/21) ([gitter-badger](https://github.com/gitter-badger))
- Fixed README nits [\#19](https://github.com/kaazing/gateway/pull/19) ([vjwang](https://github.com/vjwang))

## [gateway.distribution-5.0.1.19](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.1.19) (2015-01-09)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.1.18...gateway.distribution-5.0.1.19)

## [gateway.distribution-5.0.1.18](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.1.18) (2014-12-20)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.1.17...gateway.distribution-5.0.1.18)

**Merged pull requests:**

- Got rid of copyright in pom because they are not auto updated from licen... [\#25](https://github.com/kaazing/gateway/pull/25) ([dpwspoon](https://github.com/dpwspoon))

## [gateway.distribution-5.0.1.17](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.1.17) (2014-12-18)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.1.16...gateway.distribution-5.0.1.17)

**Closed issues:**

- building gateway on MacOSX 10.7+ can yield " group id '2119906183' is too big \( \> 2097151 \)" assembly error [\#23](https://github.com/kaazing/gateway/issues/23)

**Merged pull requests:**

- Apply fix for http://jira.codehaus.org/browse/MASSEMBLY-728  [\#24](https://github.com/kaazing/gateway/pull/24) ([nowucca](https://github.com/nowucca))
- Updated project to appendAssemblyId false so that artifacts don't need v... [\#22](https://github.com/kaazing/gateway/pull/22) ([dpwspoon](https://github.com/dpwspoon))

## [gateway.distribution-5.0.1.16](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.1.16) (2014-12-17)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.1.15...gateway.distribution-5.0.1.16)

## [gateway.distribution-5.0.1.15](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.1.15) (2014-12-17)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.1.14...gateway.distribution-5.0.1.15)

## [gateway.distribution-5.0.1.14](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.1.14) (2014-12-16)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.0.16...gateway.distribution-5.0.1.14)

## [gateway.distribution-5.0.0.16](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.0.16) (2014-12-16)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.0.15...gateway.distribution-5.0.0.16)

## [gateway.distribution-5.0.0.15](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.0.15) (2014-12-12)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.0.14...gateway.distribution-5.0.0.15)

**Merged pull requests:**

- Update distribution names and Gateway startup log [\#17](https://github.com/kaazing/gateway/pull/17) ([dpwspoon](https://github.com/dpwspoon))
- Changed filenames and port \# [\#16](https://github.com/kaazing/gateway/pull/16) ([vjwang](https://github.com/vjwang))
- Updated naming and content [\#13](https://github.com/kaazing/gateway/pull/13) ([vjwang](https://github.com/vjwang))

## [gateway.distribution-5.0.0.14](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.0.14) (2014-12-11)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.0.13...gateway.distribution-5.0.0.14)

**Merged pull requests:**

- KG-13558:  Add an echo service, update the 'It Works' page to connect to... [\#11](https://github.com/kaazing/gateway/pull/11) ([krismcqueen](https://github.com/krismcqueen))
- Updated project to use kaazing sigar dist [\#7](https://github.com/kaazing/gateway/pull/7) ([dpwspoon](https://github.com/dpwspoon))

## [gateway.distribution-5.0.0.13](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.0.13) (2014-12-10)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.0.12...gateway.distribution-5.0.0.13)

## [gateway.distribution-5.0.0.12](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.0.12) (2014-12-10)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.0.11...gateway.distribution-5.0.0.12)

**Merged pull requests:**

- Updated name of bower-maven-plugin [\#6](https://github.com/kaazing/gateway/pull/6) ([dpwspoon](https://github.com/dpwspoon))

## [gateway.distribution-5.0.0.11](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.0.11) (2014-12-04)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.0.10...gateway.distribution-5.0.0.11)

## [gateway.distribution-5.0.0.10](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.0.10) (2014-12-04)
[Full Changelog](https://github.com/kaazing/gateway/compare/gateway.distribution-5.0.0.9...gateway.distribution-5.0.0.10)

## [gateway.distribution-5.0.0.9](https://github.com/kaazing/gateway/tree/gateway.distribution-5.0.0.9) (2014-12-04)
**Merged pull requests:**

- Updated project to use bower-dependency-maven-plugin to get bower compon... [\#5](https://github.com/kaazing/gateway/pull/5) ([dpwspoon](https://github.com/dpwspoon))
- KG-14359: fixed problem with 000 root-directory permissions [\#4](https://github.com/kaazing/gateway/pull/4) ([davecombs](https://github.com/davecombs))
- KG-13959: gateway.distribution with Command Center data coming from a bower-based project [\#3](https://github.com/kaazing/gateway/pull/3) ([davecombs](https://github.com/davecombs))
- Using repository's NOTICE.txt in distribution as well [\#2](https://github.com/kaazing/gateway/pull/2) ([jitsni](https://github.com/jitsni))
- Modifying NOTICE.txt with all the info [\#1](https://github.com/kaazing/gateway/pull/1) ([jitsni](https://github.com/jitsni))



\* *This Change Log was automatically generated by [github_changelog_generator](https://github.com/skywinder/Github-Changelog-Generator)*