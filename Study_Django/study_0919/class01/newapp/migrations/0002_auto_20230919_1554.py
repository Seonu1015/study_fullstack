# Generated by Django 4.2.5 on 2023-09-19 06:54

from django.db import migrations

def create_initial_data(apps, schema_editor):
    NewModel = apps.get_model('newapp', 'NewModel')
    NewModel.objects.create(name='kim', skill='java')

def delete_initial_data(apps, schema_editor):
    NewModel = apps.get_model('newapp', 'NewModel')
    NewModel.objects.all().delete()    

class Migration(migrations.Migration):

    dependencies = [
        ('newapp', '0001_initial'),
    ]

    operations = [
        migrations.RunPython(delete_initial_data)
    ]
