(defproject congomongo "0.1.10-SNAPSHOT"
  :description "clojure-friendly api for MongoDB"
  :repositories [["sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots/"]]
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/core.incubator "0.1.0"]
                 [org.clojure/data.json "0.1.3"]
                 [org.mongodb/mongo-java-driver "2.7.3"]]
  :aliases {"test-all" ["with-profile" "dev,default:dev,1.2,default:dev,1.4,default:dev,1.5,default" "test"]}
  :profiles {:1.2 {:dependencies [[org.clojure/clojure "1.2.1"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.0-master-SNAPSHOT"]]}})
