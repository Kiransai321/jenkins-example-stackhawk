import boto3
import logging

class ConformancePack:
   def create_conformance_pack():
      client = boto3.client('config')

      try:    
         logging.info('Creating Conformance Pack')
         response = client.put_conformance_pack(
            ConformancePackName='AwsConfigConformancePack',
            TemplateS3Uri='s3://conformance-pack-aws-config/Operational-Best-Practices-for-APRA-CPG-234.yaml'
         )
      except Exception as e:
         print("Error:", e)