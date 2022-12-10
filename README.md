```
sbt:scalajs-linking-zquery> run
[info] Fast optimizing /dev/shm/scalajs-linking-zquery/target/scala-3.2.1/scalajs-linking-zquery-fastopt
[error] Referring to non-existent class zio.query.ZQuery$
[error]   called from constructor example.Hello$.<init>()void
[error]   called from static example.Hello.main([java.lang.String)void
[error]   called from core module module initializers
[error] Referring to non-existent class zio.query.ZQuery
[error]   called from constructor example.Hello$.<init>()void
[error]   called from static example.Hello.main([java.lang.String)void
[error]   called from core module module initializers
[error] Referring to non-existent class zio.query.ZQuery
[error]   called from example.Hello$.query()zio.query.ZQuery
[error]   called from constructor example.Hello$.<init>()void
[error]   called from static example.Hello.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.Hello$
[error] Referring to non-existent class zio.query.ZQuery
[error]   called from example.Hello$.query()zio.query.ZQuery
[error]   called from constructor example.Hello$.<init>()void
[error]   called from static example.Hello.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.Hello$
[error] Referring to non-existent class zio.query.ZQuery$
[error]   called from constructor example.Hello$.<init>()void
[error]   called from static example.Hello.main([java.lang.String)void
[error]   called from core module module initializers
[error] Referring to non-existent method zio.query.ZQuery$.succeed(scala.Function0,java.lang.Object)zio.query.ZQuery
[error]   called from constructor example.Hello$.<init>()void
[error]   called from static example.Hello.main([java.lang.String)void
[error]   called from core module module initializers
[error] Referring to non-existent class zio.query.ZQuery$
[error]   called from constructor example.Hello$.<init>()void
[error]   called from static example.Hello.main([java.lang.String)void
[error]   called from core module module initializers
[error] Cannot access module for non-module zio.query.ZQuery$
[error]   called from constructor example.Hello$.<init>()void
[error]   called from static example.Hello.main([java.lang.String)void
[error]   called from core module module initializers
[error] Referring to non-existent class zio.query.ZQuery
[error]   called from constructor example.Hello$.<init>()void
[error]   called from static example.Hello.main([java.lang.String)void
[error]   called from core module module initializers
[error] There were linking errors
[error] (Compile / fastLinkJS) There were linking errors
[error] Total time: 0 s, completed Dec 11, 2022, 3:51:22 AM
```
